package com.enset.chatbot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.*;
import jakarta.persistence.Id;

@Entity
@NoArgsConstructor
@Builder
@Getter
@Setter
@AllArgsConstructor
public class Person {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Size(min = 4 , max = 100)
    private String name;
    @Email
    private String email;
}
