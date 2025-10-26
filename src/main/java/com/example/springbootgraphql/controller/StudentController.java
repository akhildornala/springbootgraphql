package com.example.springbootgraphql.controller;

import com.example.springbootgraphql.dto.Post;
import com.example.springbootgraphql.dto.StudentDto;
import com.example.springbootgraphql.dto.User;
import com.example.springbootgraphql.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

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

    @QueryMapping
    public String welcomemsg(@Argument String input) {
        return "welcome" + input;
    }

    @QueryMapping
    public List<Integer> getSomeNumber() {
        return List.of(1, 2, 3, 4, 5);
    }

    @QueryMapping
    List<Post> getPosts() {
        return List.of(
                new Post("p1", "Post 1", "description 1"),
                new Post("p2", "Post 2", "description 2"),
                new Post("p3", "Post 3", "description 3l")
        );
    }

    @SchemaMapping(typeName = "Post")
    User author(Post post) {
        return new User("one", "User is " + post.getTitle());
    }

    @SchemaMapping(typeName = "User")
    List<Post> posts(User user) {
        return getPosts();
    }


}
