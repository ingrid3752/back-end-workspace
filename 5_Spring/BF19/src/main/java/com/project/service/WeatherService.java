package com.project.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.api.util.WeatherJsonParsing;
import com.project.domain.Weather;
import com.project.repo.WeatherDAO;

@Service
public class WeatherService {
	
	@Autowired
	private WeatherDAO dao;
	
	@Autowired
	private WeatherJsonParsing util;
	
	public List<Weather> allData() {
		return dao.findAll();
	}
	
	public void saveWeatherData(String jsonResponse) throws IOException {
		List<Weather> Weather = util.parseWeatherData(jsonResponse)
	}
}
