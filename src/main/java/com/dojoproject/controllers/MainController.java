package com.dojoproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping("/")
	public String helloWorld(Model model) {
		model.addAttribute("message", "Edgar is the last one standing!");
		return "hello";
	}
}
