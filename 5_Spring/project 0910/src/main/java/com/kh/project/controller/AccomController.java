package com.kh.project.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.kh.project.model.vo.AccomReservation;
import com.kh.project.service.AccomService;

@Controller
public class AccomController {

    @Autowired
    private AccomService service;

    @GetMapping("/accomReservation")
    public String reservationList(Model model) {
        model.addAttribute("list", service.reservationList());
		return "accomReservation";
    }

    @GetMapping("/accomInsertReservation")
    public String insertReservationPage(AccomReservation vo) {
    	System.out.println(vo);
        return "accomInsertReservation";
    }

    @PostMapping("/accomInsertReservation")
	public String accomInsertReservation(AccomReservation vo, @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate, @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate, int accomcode, int memCode) {
    	
        service.insertReservation(vo);
        return "redirect:/accomReservation";
    }
}