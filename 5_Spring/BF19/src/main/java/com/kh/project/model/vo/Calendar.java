package com.kh.project.model.vo;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Calendar {
	
	private int calendarCode;
	private String calendarPhone;
	private String location;
	private LocalDateTime calendarDate;
	private int headCount;
	private int price;
	private String calendarName;
	
}
