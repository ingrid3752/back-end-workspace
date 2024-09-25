package com.kh.project.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.project.model.vo.CalendarReservation;

import mapper.CalendarMapper;

@Service
public class CalendarService {
	
	@Autowired
	private CalendarMapper mapper;
	
	// 일정 목록 조회
    public List<CalendarReservation> ReservationList(int memCode){
    	return mapper.ReservationList(memCode);
    }
    
    // 일정 추가
    public void insertReservation(CalendarReservation vo) {
    	mapper.insertReservation(vo);
    }
    
    // 추가한 일정 저장
    public void saveReservation(CalendarReservation vo) {
    	mapper.insertReservation(vo);
    }
    
    // 일정 삭제
    public void deleteReservation(int reservationId, int memCode) {
        mapper.deleteReservation(reservationId);
    }
    
    
    
}
