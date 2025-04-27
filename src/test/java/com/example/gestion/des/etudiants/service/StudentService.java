package com.example.gestion.des.etudiants.service;



import java.util.List;
import java.util.Optional;

public interface StudentService<Student> {

    <Student> Student saveStudent(Student student);

    List<Student> getAllStudents();

    Optional<Student> getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudent(Long id);

    List<Student> getStudentsByMajor(String major);

    List<Student> getStudentsYoungerThan(int age);

    List<Student> getStudentsByLastNamePattern(String pattern);

    List<Student> getStudentsInAgeRange(int minAge, int maxAge);
}