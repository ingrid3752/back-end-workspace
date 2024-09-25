package com.kh.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.kh.project.service.NotepadService;

// RequestMapping("/review") = "/" = /WEB-INF/review.jsp, + @GetMapping("/review") = /review/review
@Controller
public class NotepadController {
	
	@Autowired
	private NotepadService notepadService;
	
	// 메모 작성
	
	
}
