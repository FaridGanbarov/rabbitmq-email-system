package com.example.consumerservice.listener;

import com.example.common.EmailMessage;
import com.example.consumerservice.service.EmailService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Slf4j
@Component
@RequiredArgsConstructor
public class EmailConsumer {

    private final EmailService emailService;

    @RabbitListener(queues = "email.queue")
    public void receiveMessage(EmailMessage message) {

        log.info("Received message: {}", message);

        try {
            emailService.sendEmail(message);
            log.info("Email sent successfully!");

        } catch (Exception e) {
            log.error("Failed to send email: {}", e.getMessage());
        }
    }
}
