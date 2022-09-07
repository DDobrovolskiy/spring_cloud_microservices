package org.example.services;

import org.example.cofiguration.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.retry.annotation.Retryable;
import ru.api.NameApi;

@FeignClient(value = "eclient", configuration = {FeignConfig.class})
public interface NamedFeignService extends NameApi {
}
