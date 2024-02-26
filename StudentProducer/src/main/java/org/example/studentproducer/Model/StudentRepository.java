package org.example.studentproducer.Model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends  JpaRepository<Student, Integer>{
}

