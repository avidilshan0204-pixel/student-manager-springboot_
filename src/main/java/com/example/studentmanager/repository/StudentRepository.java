package com.example.studentmanager.repository;

import com.example.studentmanager.model.student; 
import org.springframework.data.jpa.repository.JpaRepository; 

public interface StudentRepository extends JpaRepository<student, Long> { 
   
    boolean existsByEmail(String email); 
    boolean existsByEmailAndIdNot(String email, Long id); 
} 
