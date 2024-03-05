package com.taxiManager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.taxiManager.service.MainService;
import com.taxiManager.vo.DriveInfoVO;
import com.taxiManager.vo.UserVO;

@Controller
public class MainController {
	
	@Autowired
	MainService mainService;
	
	@GetMapping("/")
	public String mainPage(Model model) {
		
		System.out.println("메인페이지 실행");
		return "views/main/index.html";
	}
	
	@GetMapping("/signIn")
	public String mainLogin(Model model) {
		
		System.out.println("로그인 페이지 실행");
		return "views/user/signIn.html";
	}
	
	@GetMapping("/signUp")
	public String mainSignUp(Model model) {
		
		System.out.println("로그인 페이지 실행");
		return "views/user/signUp.html";
	}
	
	
}
