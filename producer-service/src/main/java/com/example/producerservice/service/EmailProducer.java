package com.example.producerservice.service;

import com.example.producerservice.config.RabbitMQConfig;
import lombok.RequiredArgsConstructor;
import com.example.common.EmailMessage;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailProducer {
    private final RabbitTemplate rabbitTemplate;

    public void sendEmail(EmailMessage message) {
        rabbitTemplate.convertAndSend(
                RabbitMQConfig.EXCHANGE,
                RabbitMQConfig.ROUTING_KEY,
                message
        );
    }
}
