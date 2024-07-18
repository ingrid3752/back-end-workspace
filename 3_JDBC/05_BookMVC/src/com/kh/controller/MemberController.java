package com.kh.controller;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.kh.model.Book;
import config.ServerInfo;

public class MemberController {
	Properties p = new Properties();
	
	// 드라이버 생성, properties 연결
	private MemberController() {
		
		try {
			p.load(new FileInputStream("src/config/jdbc.properties"));
			
			Class.forName(ServerInfo.DRIVER_NAME);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// DB 연결
	public Connection connect() throws SQLException {
		return DriverManager.getConnection(ServerInfo.URL, ServerInfo.USER, ServerInfo.PASSWORD);
	}
	
	// 자원 반납
	public void close(PreparedStatement ps, Connection conn) throws SQLException {
		ps.close();
		conn.close();
	}
	
	public void close(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException {
		rs.close();
		close(ps, conn);
	}
	
	private static MemberController instance;
	public static MemberController getInstance() {
		if(instance == null) instance = new MemberController();
		return instance;
	}
	
	public boolean titleCheck(String title) throws SQLException {
		Connection conn = connect();
		PreparedStatement ps = conn.prepareStatement(p.getProperty("titleCheck"));
		ps.setString(1, title);
		
		ResultSet rs = ps.executeQuery();
		String checkTitle = null;
		
		if(rs.next()) checkTitle = rs.getString("title");
		close(rs, ps, conn);
		
		if(checkTitle != null) return true;
		return false;
	}
	// Unknown column title in 'field list' - title이라는 이름의 컬럼 지정
	public boolean registerBook(Book b) throws Exception { 
		if(!titleCheck(b.getBk_title())) {
			Connection conn = connect();
			PreparedStatement ps = conn.prepareStatement(p.getProperty("registerBook"));
			ps.setString(1, b.getBk_title());
			ps.setString(2, b.getBk_author());
			ps.setInt(3, b.getBk_price());
			
			ps.executeUpdate();
			close(ps, conn);
			return true;
		}
		
		return false;
	}
}
