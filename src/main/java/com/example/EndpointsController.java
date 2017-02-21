package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by scottyvg on 2/20/17.
 */

@RestController
@RequestMapping("/app")
public class EndpointsController {

    @GetMapping("/")
    public String getIndex() {
        return"Get to index route";
    }

    @PostMapping("/tasks")
    public String getTasks() {
        return "These are tasks";
    }


}
