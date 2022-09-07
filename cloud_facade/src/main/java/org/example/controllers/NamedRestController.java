package org.example.controllers;

import org.example.services.NamedFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.api.NameApi;

@RestController
@RequestMapping("/api")
public class NamedRestController implements NameApi {

    @Autowired private NamedFeignService service;

    @Override
    public String getName() {
        System.out.println("facade");
        return service.getName();
    }
}
