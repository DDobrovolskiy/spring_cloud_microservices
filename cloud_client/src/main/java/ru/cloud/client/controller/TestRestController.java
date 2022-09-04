package ru.cloud.client.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestRestController {
    @Value("${eureka.instance.instance-id}")
    private String instance;

    @GetMapping("/test")
    public String getTest() {
        return "id: " + instance;
    }
}
