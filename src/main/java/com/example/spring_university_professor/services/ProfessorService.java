package com.example.spring_university_professor.services;

import com.example.spring_university_professor.models.Professor;
import com.example.spring_university_professor.repositories.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {


    private final ProfessorRepository professorRepository;

    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }


    public List<Professor> getProfessors() {
        return (List<Professor> )professorRepository.findAll();
    }

}


