package com.monika.expense_tracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Expense Tracker!";
    }

    @GetMapping("/hello/{name}")
    public String helloName(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("/api/info")
    public Map<String, Object> info() {
        return Map.of(
                "app", "Expense Tracker",
                "version", "1.0",
                "status", "running"
        );
    }
}