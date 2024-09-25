package com.kh.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.project.model.vo.Member;
import mapper.MemberMapper;

@Service
public class MemberService {

    @Autowired
    private MemberMapper memberMapper;
   
    public Member idCheck(String id) {
		return memberMapper.idCheck(id);
	}
    
    public Member login(Member vo) {
        return memberMapper.login(vo);
    }

    public boolean signUp(Member vo) {
        try {
            int result = memberMapper.signUp(vo);
            return result == 1; // 삽입된 레코드 수가 1이면 성공
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    // 회원정보 수정(아이디)
    public boolean update(Member vo) {
        try {
            int result = memberMapper.update(vo);
            return result > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public void delete(int no) {
    	memberMapper.delete(no);
    }
    
}
