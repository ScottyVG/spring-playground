package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by scottyvg on 3/5/17.
 */
@RestController
@RequestMapping("/math")
public class MathController {
    @GetMapping("/pi")
    public String pi() {
        return "3.141592653589793";
    }

}
