package ru.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


public interface NameApi {
    @GetMapping("/name")
    List<String> getName();

    @GetMapping("/name2")
    List<String> getName2();
}
