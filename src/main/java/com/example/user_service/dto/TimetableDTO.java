package com.example.user_service.dto;

import com.example.user_service.entity.Lesson;
import lombok.Data;

import java.util.List;

@Data
public class TimetableDTO {

    private String dayOfWeek;
    private String group;
    private String course;
    private List<Lesson> lessonsQuery;
}
