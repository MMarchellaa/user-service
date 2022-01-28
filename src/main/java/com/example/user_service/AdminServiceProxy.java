package com.example.user_service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "api-gateway")
public interface AdminServiceProxy {
    @GetMapping("/admin-service/timetable/get/{course}/{group}")
    String getTimetable(@PathVariable("course") String course, @PathVariable("group") String group);
}