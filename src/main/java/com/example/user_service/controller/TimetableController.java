package com.example.user_service.controller;


import com.example.user_service.AdminServiceProxy;
import com.example.user_service.entity.Group;
import com.example.user_service.entity.Lesson;
import com.example.user_service.entity.Timetable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TimetableController {

    @Autowired
    private AdminServiceProxy proxy;

    @GetMapping("/{course}/{group}")
    public Timetable getTimetable(@PathVariable("course") String course, @PathVariable("group") String group) {
        Timetable timetable = new Timetable(5L, "Monday",
                new Group(5L, course, group), List.of(new Lesson(5L, "АГиЛА", "Березкина Л.Л.", "615"),
                new Lesson(6L, "Механика", "Поляков", "615"),
                new Lesson(),
                new Lesson(7L, "ЦОС", "Микула", "615")));
        return timetable;
    }

    @GetMapping("/feign/{course}/{group}")
    public String getTimetableFeign(@PathVariable("course") String course, @PathVariable("group") String group) {
        return proxy.getTimetable(course, group);
    }
}
