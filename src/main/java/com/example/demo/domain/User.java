package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
//@Data
//@Table(name = "USER")
public class User {
    @Id
    private Long id;
//    @Column(name="STUDENT_NAME", length=50, nullable=false, unique=false,updatable = false)
    private String name;
    private String email;
    private String password;
}
