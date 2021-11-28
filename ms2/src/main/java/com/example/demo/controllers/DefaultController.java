package com.example.demo.controllers;

import com.example.demo.models.MessageDTO;
import com.example.demo.services.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DefaultController {

    private final ConsumerService consumerService;

    @Autowired
    public DefaultController(ConsumerService consumerService) {
        this.consumerService = consumerService;
    }

    @GetMapping("/get")
    public MessageDTO getMessage() {
        return consumerService.getMessage();
    }
}
