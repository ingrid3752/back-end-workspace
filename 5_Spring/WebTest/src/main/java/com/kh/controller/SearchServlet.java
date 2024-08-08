package com.kh.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.kh.model.dao.EmployeeDAO;
import com.kh.model.vo.Employee;

@WebServlet("/search")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//원인1 : 문자열을 int로 변경하는 코드필요 = Integer.parseInt
		int id = Integer.parseInt(request.getParameter("id")); 
		
		EmployeeDAO dao = new EmployeeDAO(); //원인2 : EmployeeDAO 생성후 import
		
		try {					//원인4 : search(id)
			Employee employee = dao.search(id); //원인3 : class Employee 생성후 import
			
			
			if(employee!=null) {
				//원인 : setAttribute가 아닌 getAttribute = setAttribute("employee",employee);
				request.setAttribute("employee", employee); 
				//원인 : getRequestDispatcher 뒤에 어떤 형식으로 보낼지 미기입
				request.getRequestDispatcher("views/search.jsp").forward(request, response); 
			} else {
				response.sendRedirect("views/fail.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
