# RabbitMQ Email System (Spring Boot Microservices)

A simple event-driven microservices system using Spring Boot and RabbitMQ.
Producer service sends email messages, and Consumer service processes them asynchronously.

## Architecture

Producer Service → RabbitMQ → Consumer Service

## Technologies Used

- Java 21
- Spring Boot
- Spring AMQP (RabbitMQ)
- Docker & Docker Compose
- Gradle
- Postman

## Project Structure

rabbitmq-email-system/
├── producer-service
├── consumer-service
├── common
├── docker-compose.yml

## Features

- REST API to send email messages
- RabbitMQ message queue communication
- Producer–Consumer architecture
- JSON message conversion
- Input validation (@Email, @NotBlank)

## How to Run

1. Start RabbitMQ
   docker-compose up -d

2. Run Consumer Service
   ./gradlew :consumer-service:bootRun

3. Run Producer Service
   ./gradlew :producer-service:bootRun

## API Usage

POST http://localhost:8080/api/email

{
"to": "test@gmail.com",
"subject": "Hello",
"body": "RabbitMQ test message"
}

## Key Learnings

- Event-driven architecture
- Microservices communication
- Message brokers (RabbitMQ)
- Producer-Consumer pattern

## Author

Farid Ganbarov