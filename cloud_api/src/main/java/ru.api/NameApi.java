package ru.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


public interface NameApi {
    @RequestMapping(method = RequestMethod.GET, value = "/name")
    String getName();
}
