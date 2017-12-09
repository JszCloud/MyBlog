package com.titular.myblog.controller;

import javax.annotation.Resource;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.titular.myblog.pojo.User;
import com.titular.myblog.service.UserService;

@Controller
public class UserController {
	@Resource
	private UserService userService;
	@RequestMapping("/user")
	public String user(Model model) {
		  User user = this.userService.selectById(1);  
	        model.addAttribute("user", user);
	        System.out.println(user);
		return "user";
		
	}
}
