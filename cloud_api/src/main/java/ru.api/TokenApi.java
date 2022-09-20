package ru.api;

import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ddobrovolskiy
 * @since 20.09.2022
 */

public interface TokenApi {
    @GetMapping("/token")
    List<String> getTokens();

    @PostMapping("/token")
    String createToken(@RequestBody String seed);
}
