package com.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.domain.Weather;

public interface WeatherDAO extends JpaRepository<Weather, Long>{

}
