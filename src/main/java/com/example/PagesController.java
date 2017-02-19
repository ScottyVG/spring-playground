package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by scottyvg on 2/19/17.
 */

@RestController
public class PagesController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello world";
    }
}
