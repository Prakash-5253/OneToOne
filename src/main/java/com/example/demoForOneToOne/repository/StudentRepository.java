package com.example.demoForOneToOne.repository;

import com.example.demoForOneToOne.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,String> {
}
