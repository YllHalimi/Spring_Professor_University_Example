package com.example.spring_university_professor.controllers;

import com.example.spring_university_professor.models.Professor;
import com.example.spring_university_professor.services.ProfessorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/professors")
public class ProfessorController {

    private final ProfessorService professorService;

    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

@GetMapping
    public List<Professor> getProfessors(){
        return professorService.getProfessors();
    }

}
