package ru.cloud.order.entity.cashed;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

/**
 * @author ddobrovolskiy
 * @since 20.09.2022
 */

@RedisHash("Token")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Token implements Serializable {
    private String id;
    private String token;
}
