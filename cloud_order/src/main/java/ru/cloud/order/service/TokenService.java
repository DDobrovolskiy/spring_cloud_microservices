package ru.cloud.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.cloud.order.entity.cashed.Token;
import ru.cloud.order.repository.TokenRedisRepository;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * @author ddobrovolskiy
 * @since 20.09.2022
 */

@Service
public class TokenService {

//    @Autowired private TokenRedisRepository repository;

    public List<String> getTokens() {
//        return repository.findAll().stream()
//                .map(Token::getToken)
//                .collect(Collectors.toList());
        return List.of("TOKEN");
    }

    public String createToken(String seed) {
//        return repository.save(new Token(UUID.randomUUID().toString(), seed)).getId();
        return seed;
    }
}
