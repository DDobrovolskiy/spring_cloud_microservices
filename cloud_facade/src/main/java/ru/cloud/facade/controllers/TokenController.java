package ru.cloud.facade.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.api.TokenApi;
import ru.cloud.facade.services.TokenProxyService;

import java.util.List;

/**
 * @author ddobrovolskiy
 * @since 20.09.2022
 */

@RestController
public class TokenController implements TokenApi {

    @Autowired private TokenProxyService service;

    @Override
    public List<String> getTokens() {
        return service.getTokens();
    }

    @Override
    public String createToken(String seed) {
        return service.createToken(seed);
    }
}
