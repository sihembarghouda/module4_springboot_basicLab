package com.example.gestion.des.etudiants.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
// If using Lombok, include these:
// import lombok.AllArgsConstructor;
// import lombok.Data;
// import lombok.NoArgsConstructor;

@Setter
@Getter
@Entity
@Table(name = "students")
// If using Lombok, uncomment these:
// @Data
// @NoArgsConstructor
// @AllArgsConstructor
public class Student {

    // Getters and setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private String major;

    // Constructor, getters, and setters
    // (Not needed if using Lombok's @Data, @NoArgsConstructor, and @AllArgsConstructor)

    public Student() {
    }

    public Student(String firstName, String lastName, String email, int age, String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", major='" + major + '\'' +
                '}';
    }
}