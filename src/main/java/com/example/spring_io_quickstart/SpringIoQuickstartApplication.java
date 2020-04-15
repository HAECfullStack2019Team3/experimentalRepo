package com.example.spring_io_quickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringIoQuickstartApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringIoQuickstartApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello (@RequestParam(value = "name", defaultValue = "Team3") String name) {
        return String.format("Hello %s!", name);
    }

}
