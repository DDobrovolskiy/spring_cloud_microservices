package ru.cloud.facade.services;

import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.api.NameApi;

@FeignClient(contextId = "name", name = "order", fallbackFactory = NamedFallbackFactory.class)//fallback = NamedFeignFallback.class)//, configuration = {FeignConfig.class})
public interface NamedProxyService extends NameApi {

    @Override
    @GetMapping("/api/name")
    String getName();
}

@Component
class NamedFallbackFactory implements FallbackFactory<NameApi> {
    @Override
    public NameApi create(Throwable cause) {
        System.out.println("Server ERROR");
        System.out.println(cause.getMessage());
        return (NamedProxyService) cause::getMessage;
    }
}
