package com.kh.project.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.project.model.vo.Notepad;


import mapper.NotepadMapper;

@Service
public class NotepadService {
	
	@Autowired
	private NotepadMapper notepadMapper;
	
	// 메모 작성
	public void addReview(Notepad notepad) {
		notepadMapper.insertNotepad(notepad);
	}
	
	// 메모 저장
	public void saveReview(Notepad notepad) {
		notepadMapper.insertNotepad(notepad);
	}
	
	// 회원이 작성한 메모 조회
	public List<Notepad> getReviewByMember(int memCode) {
		return notepadMapper.getNotepadByMember(memCode);
	}
}
