package ru.cloud.client.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Configuration
public class TestRestController {
    @Value("${eureka.instance.instance-id}")
    private String instance;
    @Value("${autoconfig.eclient}")
    private String config;

    @GetMapping("/test")
    public String getTest() {
        return "config: " + config + "id: " + instance;
    }
}
