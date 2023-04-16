package ru.cloud.facade.services;

import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.api.NameApi;

import java.util.List;

@FeignClient(contextId = "name", name = "order")//fallback = NamedFeignFallback.class)//, configuration = {FeignConfig.class})
public interface NamedProxyService extends NameApi {

    @Override
    @GetMapping("/api/name")
    List<String> getName();

    @Override
    @GetMapping("/api/name2")
    List<String> getName2();
}
