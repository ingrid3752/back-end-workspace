package com.kh.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.kh.model.vo.Employee;

public class EmployeeDAO {
	
	public EmployeeDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnect() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/kh", "root","qwer1234");
	}
	
	public void close(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException {
		if(rs!=null) rs.close();
		if(ps!=null) ps.close();
		if(conn!=null) conn.close();
	}
	
	public Employee search(int id) throws SQLException { //원인 : class Employee 생성후 import
		Connection conn = getConnect();
		
		String query = "SELECT * FROM employee WHERE emp_id = ?";
		PreparedStatement ps = conn.prepareStatement(query); 
		ps.setInt(1, id); //원인 : 파라미터 미기입
		
		ResultSet rs = ps.executeQuery();
		Employee employee = null;
		
		if(rs.next()) {
			employee = new Employee(id, rs.getString("emp_name"), 
					rs.getString("email"), rs.getString("phone")); //원인 : 생성자 미기입
		}

		close(rs, ps, conn);
		
		return employee;
	}
}



















