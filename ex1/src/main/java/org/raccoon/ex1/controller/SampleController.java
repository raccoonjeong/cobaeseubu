package org.raccoon.ex1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SampleController {
    @GetMapping("/hello")
    public String hello() {
        // return new String[]{"Hello", "World"};
        return "/test.html";
    }

}
