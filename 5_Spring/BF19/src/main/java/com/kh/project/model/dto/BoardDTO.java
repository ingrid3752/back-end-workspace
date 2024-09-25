package com.kh.project.model.dto;
import java.util.List;

import com.kh.project.model.vo.Board;
import com.kh.project.model.vo.Paging;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class BoardDTO {
	
	private List<Board> list;
	private Paging paging;
}