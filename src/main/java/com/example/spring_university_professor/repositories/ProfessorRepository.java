package com.example.spring_university_professor.repositories;

import com.example.spring_university_professor.models.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository  extends JpaRepository<Professor, Long> {

}
