package com.wipro.travelling.controller;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wipro.travelling.service.PassengerService;

@Controller

public class PassengerController {
	@Autowired
	private PassengerService pservice;
	@RequestMapping("/pass")
	public String passenger() {
		return "Passenger";
		
	}
	@RequestMapping("/pdetail")
	public String getpassenger(HttpServletRequest request) {
	request.setAttribute("pdata",pservice.getpassenger());
	return "passengers";
	}

}
