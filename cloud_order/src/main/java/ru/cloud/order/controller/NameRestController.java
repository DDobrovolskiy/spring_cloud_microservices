package ru.cloud.order.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import ru.api.NameApi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class NameRestController implements NameApi {
    @Value("${eureka.instance.instance-id}")
    private String instance;
    @Value("${autoconfig.eclient}")
    private String config;
    private static AtomicInteger count = new AtomicInteger(0);

    @Override
    public List<String> getName() {
        return getList();
    }

    @Override
    public List<String> getName2() {
        return getList();
    }

    private List<String> getList() {
        //Замедляем ответ для теста retry
//        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME) + " - test");
        System.out.println("START");
        long start = System.currentTimeMillis();
        try {
            if (count.incrementAndGet() % 2 == 0) {
                Thread.sleep(10000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        return "config: " + config + " id: " + instance;
        System.out.println("SEND: " + (System.currentTimeMillis() - start) + " ms" );
        return List.of("ORDER");
    }
}
