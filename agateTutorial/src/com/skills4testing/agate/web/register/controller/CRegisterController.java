package com.skills4testing.agate.web.register.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class CRegisterController {

	@RequestMapping("/")
	public  String showHomePage(HttpSession pSession){
	
		pSession.setAttribute("name" , "Hasan!");
		return "home";
	}
}
