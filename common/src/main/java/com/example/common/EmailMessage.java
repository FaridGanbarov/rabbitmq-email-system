package com.example.common;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailMessage {
    @NotBlank(message = "Receiver (to) cannot be empty")
    @Email(message = "Invalid email format")
    private String to;

    private String subject;

    @NotBlank(message = "Body cannot be empty")
    private String body;
}
