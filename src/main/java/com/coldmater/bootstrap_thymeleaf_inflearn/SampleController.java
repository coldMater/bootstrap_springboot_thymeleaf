package com.coldmater.bootstrap_thymeleaf_inflearn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {

    @GetMapping("/hello")
    public String hello() {

        return "hello";
    }

    @GetMapping("/grid")
    public String grid() {
        return "grid";
    }

    @GetMapping("/typography")
    public String typography() {
        return "typography";
    }

    @GetMapping("/typo-css")
    public String typoCss() {
        return "typo-css";
    }

    @GetMapping("/color")
    public String color() {
        return "color";
    }

    @GetMapping("/table")
    public String table() {
        return "table";
    }
}
