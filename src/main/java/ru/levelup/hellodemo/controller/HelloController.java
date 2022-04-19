package ru.levelup.hellodemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping(value = {"/hello","/hello/{name}"})
    public String hello(@PathVariable(value = "name", required = false) String name) {
        return String.format("Hello, %s", Optional.ofNullable(name).orElse("Anonymous"));
    }
}
