package com.coldmater.bootstrap_thymeleaf_inflearn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {

    @GetMapping("/hello")
    public String hello() {

        return "hello";
    }
}