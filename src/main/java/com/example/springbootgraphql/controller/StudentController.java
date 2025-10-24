package com.example.springbootgraphql.controller;

import com.example.springbootgraphql.dto.StudentDto;
import com.example.springbootgraphql.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Slf4j
@Controller
public class StudentController {

    @Autowired
    private StudentService service;

    @QueryMapping
    public StudentDto studentInfo(@Argument String id) {
        Integer id1 = Integer.valueOf(id);
        return service.getOneStudent(id1);
    }
}
