package controller.component;

import java.util.List;


import controller.Controller;
import controller.ModelAndView;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.kh.model.dao.MemberDAO;
import com.kh.model.vo.Member;

public class AllMemberController implements Controller {

	@Override
	public ModelAndView handle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		MemberDAO dao = new MemberDAO();
		List<Member> list = dao.all();
		
		request.setAttribute("list", list);
		
		return new ModelAndView("/views/allMember.jsp");
	}

}