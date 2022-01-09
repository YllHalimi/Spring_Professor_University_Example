package com.example.spring_university_professor.services;

import com.example.spring_university_professor.DTO.UserLocationDTO;
import com.example.spring_university_professor.Mappers.UserLocationMapper;
import com.example.spring_university_professor.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private UserRepository userRepository;
    private UserLocationMapper userLocationMapper;

    public UserService(UserRepository userRepository, UserLocationMapper userLocationMapper) {
        this.userRepository = userRepository;
        this.userLocationMapper = userLocationMapper;
    }

    public List<UserLocationDTO> getAllUsersLocation() {

        return (userRepository.findAll())
                .stream()
                .map(user -> userLocationMapper.toDto(user,user.getLocation()))
                .collect(Collectors.toList());

//        return StreamSupport.stream(bookRepository.findAll().spliterator(), false)
//                .map(bookMapper::bookToBookDTO)
//                .collect(Collectors.toList());
    }


    }