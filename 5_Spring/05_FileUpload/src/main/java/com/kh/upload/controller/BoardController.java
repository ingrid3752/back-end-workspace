package com.kh.upload.controller;

import java.io.File;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import com.kh.upload.model.vo.Board;
import com.kh.upload.model.vo.Paging;
import com.kh.upload.service.BoardService;

@Controller
public class BoardController {
	private String path = "\\\\192.168.10.51\\upload\\";
	
	@Autowired
	private BoardService service;
	
	// index페이지로 이동
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	/*
	 * @GetMapping?
	 * - URL에 데이터를 포함시켜 요청
	 * - 데이터를 헤더에 포함하여 전송
	 * - URL에 데이터가 노출되어 보안에 취약
	 * 
	 * => 주로 조회할때만 사용
	 * 
	 * @PostMapping?
	 * - URL에 데이터를 노출하지않고 요청
	 * - 데이터를 바디에 포함
	 * - URL에 데이터가 노출되지않아 GET방식보다 보안이 높음
	 * 
	 * => 주로 노출되면 안되는 데이터를 저장할 때 사용
	 * 
	 * * 언제 사용하는가?
	 * @GetMapping 
	 * 
	 * - HTTP Get Method에 해당하는 표현으로 서버의 리소스를 조회할 때 사용
	 * 
	 * @PostMapping 
	 * 
	 * - HTTP Post Method에 해당하는 표현으로 서버에 리소스를 등록(저장)할 때 사용
	 * 
	 * ex) @GetMapping("/new")
	 * 	   public String New() {
	 * 		  return "/Login/회원가입";
	 * 		}
	 * = 회원가입페이지에서 Login리소스를 조회(GetMapping)함
	 * 
	 * 	  @PostMapping("/new")
	 *    public String create(MemberForm form) {
	 *    	Member member = new Member();
	 *      member.setName(form.getName());
	 *      member.setPhoneNumber(form.getPhoneNumber());
	 *      
	 *      memberService.join(member);
	 *      
	 *      return "redirect:/";
	 *    }
	 * = 회원가입페이지의 form에서 name과 phoneNumber를 사용자에게 입력받아서 
	 *   /new라는 url로 post방식으로 보이지않게보내고, MemberForm vo객체에서
	 *   (private String name; private String phoneNumber;)담아서,
	 *   회원가입 페이지에서 받은 이름,휴대폰 번호를 MemberForm 객체에 저장하고,
	 *   memberService의 join함수를 통해서 데이터를 저장하고,
	 *   join()이 완료되면 홈화면으로(redirect:/)이동한다.
	 *   
	 * */
	
	public String fileUpload(MultipartFile file) throws IllegalStateException, IOException {
		// 중복 방지를 위한 UUID 적용
		UUID uuid = UUID.randomUUID();
		String fileName = uuid.toString() + "_" + file.getOriginalFilename();
		File copyFile = new File(path + fileName);
		file.transferTo(copyFile); // 업로드한 파일이 지정한 path 위치로 저장
		return fileName;
	}
	
	/*
	 * PostMapping방식으로 /upload url로 보내고,vo의 MultipartFile을 file로 지정,
	 * fileUpload(file)로 담아내어 index페이지로 return
	 * */
	@PostMapping("/upload")
	public String upload(MultipartFile file) throws IllegalStateException, IOException {
		System.out.println("upload!");
		System.out.println("파일 이름 : " + file.getOriginalFilename());
		System.out.println("파일 사이즈 : " + file.getSize());
		System.out.println("파일 파라미터명 : " + file.getName());
		fileUpload(file);
		return "redirect:/";
	}
	
	/*
	 * PostMapping으로 URL에 보이지않게 /multiUpload url로 보내고,
	 * List<MultipartFile> files
	 * 향상된 for문으로 반복하여 file을 출력
	 * index페이지로 return
	 * */
	@PostMapping("/multiUpload")
	public String multiUpload(List<MultipartFile> files) throws IllegalStateException, IOException {
		
		for (MultipartFile file : files) {
			fileUpload(file);
		}
		return "redirect:/";
	}
	
	@GetMapping("/list")
	public String list(Model model, Paging paging) {
		List<Board> list = service.selectAll(paging);
		
		for (Board b : list) {
			LocalDateTime date = b.getDate();
			Date formatDate = Date.from(date.atZone(ZoneId.systemDefault()).toInstant());
			b.setFormatDate(formatDate);
		}
		model.addAttribute("list", list);
		model.addAttribute("paging", new Paging(paging.getPage(), service.total()));
		return "list";
	}
	
	// write 페이지로 이동
	@GetMapping("/write")
	public String write() {
		return "write";
	}
	
	@PostMapping("/write")
	public String write(Board vo) throws IllegalStateException, IOException {
		// 1. 파일 업로드 처리
		String url = fileUpload(vo.getFile());
		vo.setUrl(url);
		// 2. 해당 파일 URL과 함께 title, content DB에 저장
		service.insert(vo);
		System.out.println(vo);
		return "redirect:/view?no=" + vo.getNo();
	}

	/*
	 * GetMapping으로 view페이지 조회 board객체의 no, 
	 * 스프링의 Model을 import하여 service의
	 * select함수호출하고 /WEB-INF/view.jsp를 return
	 * */ 
	@GetMapping("/view")
	public String view(int no, Model model) {
		model.addAttribute("board", service.select(no));
		return "view";
	}
	
	@PostMapping("/update")
	public String update(Board vo) throws IllegalStateException, IOException {
		System.out.println(vo);
		System.out.println(vo.getFile().isEmpty());
		
		if (!vo.getFile().isEmpty()) {
			// 파일이 비어있지 않다면 기존 이미지 삭제(delete)
			if(vo.getUrl()!=null) { // 기존 이미지가 null이 아닌 경우
				File file = new File(path + vo.getUrl());
				file.delete();
			}
			
			// 새 이미지 등록
			String url = fileUpload(vo.getFile());
			vo.setUrl(url);
		}
		service.update(vo);
		return "redirect:/list";
	}
	
	@GetMapping("/delete")
	public String delete(int no) {
		
		// 업로드한 파일 삭제 (필요한 건 URL)
		Board board = service.select(no);
		if(board.getUrl()!=null) {
			File file = new File(path + board.getUrl());
			file.delete();
		}
		service.delete(no);
		return "redirect:/list";
	}
}