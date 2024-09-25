package com.kh.project.model.vo;

import java.util.Date;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Notepad {
	
	private Long notepadId;
	private String title;
	private int memCode;      
    private String notepadText; 
    private Date notepadDate;
}
