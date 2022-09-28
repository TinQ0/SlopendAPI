package com.slopendapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@SpringBootApplication
@RestController
public class SlopendApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(com.slopendapi.SlopendApiApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/help")
    public String help() {
        return "This is a help page";
    }

    @GetMapping("/question")
    public String question() {
        return "This is a question page";
    }

    @GetMapping("/answer")
    public String answerNoPath() {
        return "Please respond with a simple /yes or /no appended";
    }

    @GetMapping("/answer/{answer}")
    public String answer(@PathVariable String answer) {
        if (answer.equals("yes")) {
            return "Glad to hear it, we're gonna make it an amazing year!";
        } else {
            return "This is not the answer to the ultimate question of life, the universe, and everything";
        }
    }

}


