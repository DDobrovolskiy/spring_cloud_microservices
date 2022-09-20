package ru.cloud.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import ru.api.TokenApi;
import ru.cloud.order.service.TokenService;

import java.util.List;

/**
 * @author ddobrovolskiy
 * @since 20.09.2022
 */

@RestController
public class TokenRestController implements TokenApi {

    @Autowired private TokenService service;

    @Override
    public List<String> getTokens() {
        return service.getTokens();
    }

    @Override
    public String createToken(String seed) {
        return service.createToken(seed);
    }
}
