package ru.cloud.order.repository;

//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.cloud.order.entity.cashed.Token;

import java.util.List;

/**
 * @author ddobrovolskiy
 * @since 20.09.2022
 */

//@Repository
public interface TokenRedisRepository {//extends CrudRepository<Token, String> {
    List<Token> findAll();
}
