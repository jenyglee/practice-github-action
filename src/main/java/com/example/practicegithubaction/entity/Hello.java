package com.example.practicegithubaction.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Hello {
    @Id
    @GeneratedValue
    private Long id;
    private String email;
    private String password;
    //private String name;
}
