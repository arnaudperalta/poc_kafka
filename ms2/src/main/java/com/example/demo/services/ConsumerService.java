package com.example.demo.services;

import com.example.demo.models.MessageDTO;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    private MessageDTO lastMessageReceived;

    public MessageDTO getMessage() {
        return this.lastMessageReceived;
    }

    @KafkaListener(topics = "myTopic", groupId = "foo")
    public void listenKafka(MessageDTO message) {
        System.out.println(message);
        this.lastMessageReceived = message;
    }
}
