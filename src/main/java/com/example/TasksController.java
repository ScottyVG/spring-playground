package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by scottyvg on 3/5/17.
 */

@RestController
//@RequestMapping("/app")
public class TasksController {
    @GetMapping("/tasks")
    public String getTasks() {
        return "These are the tasks";
    }

    @PostMapping("/tasks")
    public String createTask() {
        return "You just POSTed to /tasks";
    }
}
