package com.example.springbootgraphql.service;

import com.example.springbootgraphql.dto.StudentDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Slf4j
@Service
public class StudentService {

    public List<StudentDto> getAllStudent() {
        return Arrays.asList(
                new StudentDto(1, "Alice", "alice@example.com", 20),
                new StudentDto(2, "Bob", "bob@example.com", 21),
                new StudentDto(3, "Charlie", "charlie@example.com", 22),
                new StudentDto(4, "Diana", "diana@example.com", 23),
                new StudentDto(5, "Ethan", "ethan@example.com", 24)
        );
    }

    public StudentDto getOneStudent(Integer id) {
        List<StudentDto> allStudents = getAllStudent();
        return allStudents.stream().filter(s -> s.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

}
