package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Book;

@Controller
public class HomeController {

	@GetMapping("/form")
	private String readForm(@ModelAttribute Book book) {
		return "form";
	}
	
	@PostMapping("/form")
	private String confirm(@ModelAttribute Book book) {
		return "confirm";
	}
}