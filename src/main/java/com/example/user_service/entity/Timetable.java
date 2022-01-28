package com.example.user_service.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Timetable {

    private Long id;
    private String dayOfWeek;
    private Group group;
    private List<Lesson> lessonsQuery;
}
