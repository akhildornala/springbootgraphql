package com.example.springbootgraphql.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Post {
    private String id;
    private String title;
    private String description;
}
