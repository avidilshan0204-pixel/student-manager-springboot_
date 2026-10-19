package com.example.studentmanager.service;


import com.example.studentmanager.model.student;
import com.example.studentmanager.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<student> findAll() {
        return repository.findAll();
    }

    public Optional<student> findById(Long id) {
        return repository.findById(id);
    }

    public student save(student student) {
        return repository.save(student);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public boolean emailExists(String email, Long excludeId) {
        return excludeId == null
                ? repository.existsByEmail(email)
                : repository.existsByEmailAndIdNot(email, excludeId);
    }
}
