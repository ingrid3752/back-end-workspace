package com.project.domain;

import java.math.BigInteger;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Builder 
@Data @NoArgsConstructor @AllArgsConstructor
public class Weather {
	
	@Id
	private Long id;
	
	@Column(name="base_date")
	private String baseDate;
	
	@Column(name="base_time")
	private String baseTime;
	
	@Column(name="category")
	private String category;
	
	@Column(name="fcst_date")
	private String fcstDate;
	
	@Column(name="fcst_time")
	private String fcstTime;
	
	@Column(name="fcst_value")
	private String fcstValue;
	
	@Column(name="nx")
	private Integer nx;
	
	@Column(name="ny")
	private Integer ny;
}
