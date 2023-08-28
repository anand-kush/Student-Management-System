package com.SMS.StudentManagementSystem.service;

import com.SMS.StudentManagementSystem.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudent();
    Student saveStudent(Student student);
    Student getStudentById(Integer id);
    Student updateStudent(Student student);
    void deleteStudentById(Integer id);
}
