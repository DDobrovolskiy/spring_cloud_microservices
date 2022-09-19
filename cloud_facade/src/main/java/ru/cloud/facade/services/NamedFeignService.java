package ru.cloud.facade.services;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;
import ru.cloud.facade.cofiguration.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import ru.api.NameApi;
import ru.cloud.facade.services.fallback.NamedFeignFallback;

@FeignClient(value = "order", fallbackFactory = NamedFallbackFactory.class)//fallback = NamedFeignFallback.class)//, configuration = {FeignConfig.class})
public interface NamedFeignService extends NameApi {
}

@Component
class NamedFallbackFactory implements FallbackFactory<NameApi> {
    @Override
    public NameApi create(Throwable cause) {
        System.out.println("Server ERROR");
        System.out.println(cause.getMessage());
        return (NamedFeignService) cause::getMessage;
    }
}
