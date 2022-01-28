package com.example.user_service.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Lesson {

    private Long id;
    private String lessonTitle;
    private String teacher;
    private String auditory;
}
