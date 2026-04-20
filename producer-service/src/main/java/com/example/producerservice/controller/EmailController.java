package com.example.producerservice.controller;

import com.example.common.EmailMessage;
import com.example.producerservice.service.EmailProducer;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/email")
@RequiredArgsConstructor
public class EmailController {
    private final EmailProducer producer;
    @PostMapping
    public String send(@Valid @RequestBody EmailMessage message) {
        producer.sendEmail(message);
        return "Message sent to RabbitMQ";
    }
}
