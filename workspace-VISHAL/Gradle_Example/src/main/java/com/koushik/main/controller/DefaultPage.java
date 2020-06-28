package com.koushik.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.koushik.main.model.Admin;
import com.koushik.main.repository.AdminRepository;

@RestController
public class DefaultPage {

	@Autowired
	AdminRepository adminrepo;
	
	@RequestMapping("/")
	public String Message() {
		return "Lets get start";
	}
	
	@RequestMapping("/login")
	public ModelAndView login() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login.html");
		return mv;
	}
	
	@RequestMapping("/Register")
	public ModelAndView registration() {
//		List<Admin> admin = adminrepo.findAll();
//		if(admin!=null) {
//			HttpSession session = request.getsession();
//		}
		ModelAndView mv = new ModelAndView();
		mv.setViewName("UserRegister.html");
		return mv;
	}
	
	
}
