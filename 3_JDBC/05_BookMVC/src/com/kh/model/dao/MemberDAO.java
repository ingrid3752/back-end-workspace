package com.kh.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.kh.model.vo.Member;

import config.ServerInfo;

public class MemberDAO {

	public MemberDAO() {
		try {
			Class.forName(ServerInfo.DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection connect() throws SQLException {
		return DriverManager.getConnection(ServerInfo.URL,ServerInfo.USER,ServerInfo.PASSWORD);
	}
	
	public void close(PreparedStatement ps, Connection conn) throws SQLException {
		ps.close();
		conn.close();
	}
	
	public void close(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException {
		rs.close();
		close(ps, conn);
	}
	
	// 4. 회원가입
		public void registerMember(String id, String password, String name) throws SQLException {
			Connection conn = connect();
			
			String query = "INSERT INTO member(member_id, member_pwd, member_name) VALUES(?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, id);
			ps.setString(2, password);
			ps.setString(3, name);
			
			ps.executeUpdate();
			close(ps, conn);
		}
		
		// 5. 로그인
		public Member login(String id, String password) throws SQLException {
			Connection conn = connect();
			String query = "SELECT * FROM member WHERE member_id = ? AND member_pwd = ?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, id);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			Member member = null;
			if(rs.next()) {
				member = new Member();
				member.setMemberId(id);
				member.setMemberPwd(password);
				member.setMemberName(rs.getString("member_name"));
				member.setMemberNo(rs.getInt("member_no"));
				member.setStatus(rs.getString("status").charAt(0));
			}
			
			close(rs, ps, conn);
			
			return null;
		}
}
