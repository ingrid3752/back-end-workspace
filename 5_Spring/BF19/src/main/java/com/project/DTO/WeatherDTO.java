package com.project.DTO;

import java.util.List;

import com.project.domain.Weather;

import lombok.Data;

@Data
public class WeatherDTO {
	
	private Header header;
	private Body body;
	
	@Data
	public static class Header {
		private String resultCode;
		private String resultMsg;
	}
	
	@Data
	public static class Body {
		private String dataType;
		private Items items;
		
		@Data
		public static class Items {
			private List<Weather> item;
		}
	}
	
}
