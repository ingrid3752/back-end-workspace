package com.kh.project.controller;

import java.util.Date;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.kh.project.model.vo.CalendarReservation;
import com.kh.project.service.CalendarService;

@Controller
public class CalendarController {

    @Autowired
    private CalendarService service;
    
    // 일정 리스트 출력
    @GetMapping("/calendarReservation")
    public String calendarReservationPage(Integer memCode, Model model) {
    	if (memCode == null) {
    		memCode = 1;
    	}
    	List<CalendarReservation> AR = service.ReservationList(memCode);
    	if (AR == null || AR.isEmpty()) {
    		model.addAttribute("message", "예약 목록이 없습니다");
    	} else {
    		model.addAttribute("calendarReservationList", AR);
    	}

    	return "calendarReservation";
    }

    // 일정 추가
    @PostMapping("/calendar/insertReservation")
    public String insertReservation(Integer memCode, CalendarReservation vo) {
    	if (memCode == null) {
    		memCode = 1;
    	}
    	service.insertReservation(vo);
    	return "redirect:/calendarReservation/" + vo.getMemCode();
    }
    
    // 숙소 예약 삭제
    @PostMapping("/calendar/deleteReservation")
    public String deleteReservation(int reservationId, int memCode) {
        service.deleteReservation(reservationId, memCode);
        return "redirect:/calendarReservation/" + memCode;
    }
    
    
    
}
