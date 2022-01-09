package com.example.spring_university_professor.repositories;

import com.example.spring_university_professor.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository  extends JpaRepository<Location, Long> {

}
