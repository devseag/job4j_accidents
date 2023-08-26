package ru.job4j.accidents.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping({"/", "/index"})
    public String getIndex() {
        return "index";
    }
}