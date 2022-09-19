package ru.cloud.facade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignCircuitBreaker;
import org.springframework.context.annotation.Bean;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class FacadeApp
{
    public static void main(String[] args) {
        SpringApplication.run(FacadeApp.class, args);
    }
}
