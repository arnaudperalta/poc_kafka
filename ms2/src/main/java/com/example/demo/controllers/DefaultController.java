package com.example.demo.controllers;

import com.example.demo.services.ProducerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DefaultController {
	
	private ProducerService producerService;

	@Autowired
	public DefaultController(ProducerService producerService) {
		this.producerService = producerService;
	}

	@GetMapping("/send")
	public String sendMessage(@RequestParam String message) {
		producerService.sendMessage(message);
		return "Message sent.";
	}

}
