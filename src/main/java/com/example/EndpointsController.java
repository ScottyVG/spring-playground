package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by scottyvg on 2/20/17.
 */

@RestController
public class EndpointsController {

    @GetMapping("/")
    public String getIndex() {
        return"Get to index route";
    }
}
