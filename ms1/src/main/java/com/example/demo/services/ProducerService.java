package com.example.demo.services;

import java.time.LocalDateTime;

import com.example.demo.models.MessageDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

	private KafkaTemplate<String, MessageDTO> kafkaTemplate;

	@Autowired
	public ProducerService(KafkaTemplate<String, MessageDTO> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}

	public void sendMessage(String message) {
		MessageDTO messageDTO = new MessageDTO();
		messageDTO.setMessage(message);
		messageDTO.setDate(LocalDateTime.now());
		kafkaTemplate.send("myTopic", messageDTO);
	}
}
