package ru.cloud.order.entity.cashed;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.redis.core.RedisHash;
//import org.springframework.data.redis.core.index.Indexed;

import java.io.Serializable;

/**
 * @author ddobrovolskiy
 * @since 20.09.2022
 */

//@RedisHash("Token")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Token {
//    @Id
//    @Indexed // Нужно для возможности поиска по полю
    private String id;
    private String token;
}
