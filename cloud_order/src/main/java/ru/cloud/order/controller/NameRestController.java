package ru.cloud.order.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import ru.api.NameApi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class NameRestController implements NameApi {
    @Value("${eureka.instance.instance-id}")
    private String instance;
    @Value("${autoconfig.eclient}")
    private String config;

    @Override
    public String getName() {
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME) + " - test");
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "config: " + config + "id: " + instance;
    }
}
