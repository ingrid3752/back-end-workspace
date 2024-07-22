package servlet.http;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/form")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 한글처리
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		// 요청
		System.out.println("form으로 요청 받음!");
		String userId = request.getParameter("userId");
		//System.out.println(userId);
		
		String userPwd = request.getParameter("userPwd");
		//System.out.println(userPwd);
		
		String gender = request.getParameter("gender");
		//System.out.println(gender);
		
		String[] menues = request.getParameterValues("menu");
		//System.out.println(menues);
		
		// form으로 해당 요청 값 받아서 응답 결과 출력
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>정보를 출력합니다..</h1>");
		out.println("<p>당신의 아이디는 " + userId + "</p>");
		out.println("<p>당신의 비밀번호는 " + userPwd + "</p>");
		
		String genderResult = gender.equals("M") ? "남자" : "여자";
		out.println("<p>당신의 성별은 " + genderResult + "</p>");
		
		out.println("<ul>");
		for(String menu : menues) {
			out.println("<li>" + menu + "</li>");
		}
		out.println("</ul>");
		out.println("</html></body>");
	}

}
