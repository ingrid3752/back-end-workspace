package com.kh.project.model.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Review {
	
	private Long reviewId;
	private String title;
	private int memCode;
	private String entityType;
	private Integer entityId;
	private int rating;         
    private String reviewText; 
    private Date reviewDate;
    private ReviewEntity entity;
    
    public Review(int memCode, String entityType, int entityId, int rating, String reviewText) {
    	
    	this.memCode = memCode;
    	this.entityType = entityType;
    	this.entityId = entityId;
    	this.rating = rating;
    	this.reviewText = reviewText;
    	
    }
}
