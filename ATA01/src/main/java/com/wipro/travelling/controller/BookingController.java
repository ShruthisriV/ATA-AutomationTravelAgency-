package com.wipro.travelling.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wipro.travelling.service.BookingService;

@Controller
public class BookingController {
	@Autowired
	private BookingService bservice;
	@RequestMapping("/book")
	public String booking() {
		return "Booking";
	}
	
	@RequestMapping("/bdetail")
	public String getbooking(HttpServletRequest request) {
		request.setAttribute("bdata",bservice.getbookings());
		return "booking";
	}
}
