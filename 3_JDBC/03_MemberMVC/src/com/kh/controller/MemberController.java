package com.kh.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.kh.model.Member;

import config.ServerInfo;

public class MemberController {
		
	// 드라이버 로딩
	public MemberController() {
		try {
			Class.forName(ServerInfo.DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// DB 연결
	public Connection getConnect() throws SQLException {
		return DriverManager.getConnection(ServerInfo.URL, ServerInfo.USER,ServerInfo.PASSWORD);
	}
	
	// 자원 반납
	public void closeAll(PreparedStatement ps, Connection conn) throws SQLException {
		ps.close();
		conn.close();
	}
	
	public void closeAll(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException {
		rs.close();
		closeAll(ps, conn);
	}
	
	public int signUp(String id, String password, String name) throws SQLException {
		// 회원가입 기능 구현! 
		// -> 아이디가 기존에 있는지 체크 여부!
		// -> member 테이블에 데이터 추가! 
		
		Connection conn = getConnect();
		
		String query = "INSERT INTO member(id, password, name) VALUES(?, ?, ?)";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setString(1, id);
		ps.setString(2, password);
		ps.setString(3, name);
		
		int result = ps.executeUpdate();
		
		closeAll(ps, conn);
		
		return result;

	}
	
	public Member login(String id, String password) throws SQLException {
		// 로그인 기능 구현! 
		// -> member 테이블에서 id와 password로 멤버 정보 하나 가져오기!
		Connection conn = getConnect();
		
		String query = "SELECT * FROM member WHERE id = ?, password = ?";
		PreparedStatement ps = conn.prepareStatement(query);
		
		ps.setString(1, id);
		ps.setString(2, password);
		
		ResultSet rs = ps.executeQuery();
		
		Member member = null;
		
		if(rs.next()) {
			member = new Member(rs.getString("id"),
								rs.getString("password"),
								rs.getString("name"));
		}
		
		closeAll(rs, ps, conn);
		
		return member;
		
	}
	
	public String changePassword(Member member) throws SQLException {
		// 비밀번호 바꾸기 기능 구현!
		// -> login 메서드 활용 후 사용자 이름이 null이 아니면 member 테이블에서 id로 새로운 패스워드로 변경
		Connection conn = getConnect();
		
		String query = "UPDATE member SET password = ? WHERE id = ?";
		PreparedStatement ps = conn.prepareStatement(query);
		
		ps.setString(1, member.getPassword());
		ps.setString(2, member.getId());
		
		String password = null;
		if(ps.executeUpdate() == 1) {
			password = member.getPassword();
		}
		
		closeAll(ps, conn);
		
		return password;
		
	}
	
	public String changeName(Member member) throws SQLException {
		// 이름 바꾸기 기능 구현!
		// -> member 테이블에서 id로 새로운 이름으로 변경
		Connection conn = getConnect();
		
		String query = "UPDATE member SET name = ? WHERE id = ?";
		PreparedStatement ps = conn.prepareStatement(query);
		
		ps.setString(1, member.getName());
		ps.setString(2, member.getId());
		
		String name = null;
		if(ps.executeUpdate() == 1) {
			name = member.getName();
		}
		
		closeAll(ps,conn);
		
		return name;
	}
	
}









