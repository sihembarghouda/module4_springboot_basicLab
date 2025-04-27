package com.example.gestion.des.etudiants.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository<Student> extends JpaRepository<Student, Long> {

    // Custom finder methods
    List<Student> findByMajor(String major);

    List<Student> findByAgeLessThan(int age);

    List<Student> findByLastNameContaining(String namePattern);

    // Custom JPQL query
    @Query("SELECT s FROM Student s WHERE s.age >= :minAge AND s.age <= :maxAge")
    List<Student> findStudentsInAgeRange(int minAge, int maxAge);
}