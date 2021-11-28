package com.example.demo.models;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MessageDTO {
	private String message;
	private LocalDateTime date;
}
