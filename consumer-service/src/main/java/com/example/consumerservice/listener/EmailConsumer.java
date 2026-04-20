package com.example.consumerservice.listener;

import com.example.common.EmailMessage;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class EmailConsumer {
    @RabbitListener(queues = "email.queue")
    public void receiveMessage(EmailMessage emailMessage) {
        System.out.println("Received: " + emailMessage);
    }
}
