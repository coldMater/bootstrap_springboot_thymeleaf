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

    @GetMapping("/table-responsive")
    public String tableResponsive() {
        return "table-responsive";
    }

    @GetMapping("/table")
    public String table() {
        return "table";
    }

    @GetMapping("/image")
    public String image() {
        return "image";
    }

    @GetMapping("/jumbotron")
    public String jumbotron() {
        return "jumbotron";
    }

    @GetMapping("/alert")
    public String alert() {
        return "alert";
    }

    @GetMapping("/button")
    public String button() {
        return "button";
    }

    @GetMapping("/badge")
    public String badge() {
        return "badge";
    }

    @GetMapping("/progress")
    public String progress() {
        return "progress";
    }


    @GetMapping("/pagination")
    public String pagination() {
        return "pagination";
    }

    @GetMapping("/breadcrumb")
    public String breadcrumb() {
        return "breadcrumb";
    }

    @GetMapping("/listgroup")
    public String listgroup() {
        return "listgroup";
    }


    @GetMapping("/card")
    public String card() {
        return "card";
    }

    @GetMapping("/form")
    public String form() {
        return "form";
    }

}
