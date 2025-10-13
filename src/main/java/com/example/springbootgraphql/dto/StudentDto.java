package com.example.springbootgraphql.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Setter
@Getter
@ToString
public class StudentDto {
    private Integer id;
    private String name;
    private String email;
    private Integer age;


}

