package com.example.spring_university_professor.controllers;

import com.example.spring_university_professor.DTO.UserLocationDTO;
import com.example.spring_university_professor.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public List<UserLocationDTO> getAllUsersLocation() {
        List <UserLocationDTO> usersLocation = userService.getAllUsersLocation();
        return usersLocation;
    }
}
