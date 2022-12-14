package ru.cloud.facade.cofiguration;


import feign.Logger;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

//Запасной вариант конфигурирования
//@Configuration
public class FeignConfig {

    @Bean
    public feign.Retryer feignRetryer() {
        return new Retryer.Default(100L, TimeUnit.SECONDS.toMillis(3L), 5);
    }

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
