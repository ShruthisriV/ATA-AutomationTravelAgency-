package com.wipro.travelling.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.wipro.travelling.entity.Vehicle;
import com.wipro.travelling.service.InsertService;
import com.wipro.travelling.service.ViewService;

@Controller
public class HomeController {
	
	@Autowired
	InsertService iservice;
	
	@Autowired
	ViewService vservice;
	
	
	
	@RequestMapping(value="/home")
	public String homePage() {
		return "home";
	}
	
	@RequestMapping(value="/login")
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping(value="/register")
	public String registerPage() {
		return "register";
	}
	
	@RequestMapping(value="/insert")
	public String insertPage() {
		return "insert";
	}
	
	@RequestMapping(value="/welcome")
	public String welcomePage() {
		return "welcome";
	}
	
	@RequestMapping(value="/viewvehicles")
	public String viewvehiclesPage() {
		return "viewvehicles";
	}
	
	@RequestMapping(value="/update")
	public String updatePage() {
		return "update";
	}
	
	@RequestMapping(value="/delete")
	public String deletePage() {
		return "delete";
	}
	
	
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String welcomePage(ModelMap model,@RequestParam String email,@RequestParam String password) {
		if(email.equals("shruthi@gmail.com") && password.equals("12345678")) 
		{
			return "welcome";
		}
		
		else if(email.equals("Travel@gmail.com") && password.equals("1234"))
				{
					return "welcome";
				}
		
		model.put("errorMsg","!Please provide correct userid and password");
		return "login";
	}
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String save(@ModelAttribute Vehicle vehicle) {
		System.out.println(vehicle);
		boolean vIdNotPresent=iservice.findByvId(vehicle.getvId());
		if(vIdNotPresent) {
			iservice.saveVehicle(vehicle);
			return "redirect:/view";
			
		}
		return "insert";
	}
	
	@GetMapping("/view")
	public String viewAllVehicles(Model m) {
		List<Vehicle> list=vservice.getAllVehicle();
		m.addAttribute("view",list);
		return "viewvehicles";
	}
	
	@GetMapping("/update")
	public String updateDetails(@RequestParam("vId") int vId,@ModelAttribute("vehicle") Vehicle vehicle,Model m) {
		Vehicle v1=vservice.getVehicleById(vId);
		m.addAttribute("v1",v1);
		return "update";
	}
	
	@PostMapping("/update")
	public String updatevehicle(@ModelAttribute("vehicle") Vehicle vehicle,RedirectAttributes attrs) {
		String msg=vservice.updatevehicle(vehicle);
		attrs.addFlashAttribute("resultMsg",msg);
		return "redirect:/view";
	}
	
	
	@GetMapping("/delete")
	public String deleteVehicle(@RequestParam("vId") int vId,RedirectAttributes attrs) {
		vservice.deleteVehicle(vId);
		return "redirect:/view";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request) {
		HttpSession session=request.getSession();
		session.invalidate();
		return "home";
	}
	@GetMapping("/welcome")
	public String home(HttpServletRequest request) {
		HttpSession session=request.getSession();
		session.invalidate();
		return "welcome";
	}

}
