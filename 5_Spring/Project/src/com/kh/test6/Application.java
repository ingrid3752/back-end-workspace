package com.kh.test6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Application {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");                  //원인4 : MySQL 스키마 미지정
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kh","root","qwer1234");
			
			String query = "SELECT * FROM employee";
			PreparedStatement st = conn.prepareStatement(query); //원인3 : query 미지정
			
			ResultSet rs = st.executeQuery(); //원인2 : SELECT문이니 executQuery() 사용 
			
			while(rs.next()) { //원인3 : while문에 지정안한 (rs) 
				System.out.println(rs.getString("emp_id") + " / " + rs.getString("emp_name")); //원인5 : 컬럼명 스네이크가 아닌 낙타로 작성
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
