package com.example.spring_university_professor.Mappers;

import com.example.spring_university_professor.DTO.UserLocationDTO;
import com.example.spring_university_professor.models.Location;
import com.example.spring_university_professor.models.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "spring")
public interface UserLocationMapper {
    UserLocationMapper INSTANCE = Mappers.getMapper(UserLocationMapper.class);

    @Mapping(source = "user.id", target = "userId")
    UserLocationDTO toDto(User user, Location location);
}



