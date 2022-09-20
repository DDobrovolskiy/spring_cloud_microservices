package ru.cloud.facade.controllers;

import ru.cloud.facade.services.NamedProxyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import ru.api.NameApi;

@RestController
public class NamedRestController implements NameApi {

    @Autowired private NamedProxyService service;

    @Override
    public String getName() {
        System.out.println("facade");
        return service.getName();
    }
}
