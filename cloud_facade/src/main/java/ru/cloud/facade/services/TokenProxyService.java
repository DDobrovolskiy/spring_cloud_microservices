package ru.cloud.facade.services;

/**
 * @author ddobrovolskiy
 * @since 20.09.2022
 */

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.api.TokenApi;

import java.util.List;

@FeignClient(contextId = "token", name = "order")
public interface TokenProxyService extends TokenApi {

    @Override
    @GetMapping("/api/token")
    List<String> getTokens();

    @Override
    @PostMapping("/api/token")
    String createToken(@RequestBody String seed);
}
