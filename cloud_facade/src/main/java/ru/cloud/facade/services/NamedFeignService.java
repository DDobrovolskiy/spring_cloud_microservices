package ru.cloud.facade.services;

import ru.cloud.facade.cofiguration.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import ru.api.NameApi;

@FeignClient(value = "eclient", configuration = {FeignConfig.class})
public interface NamedFeignService extends NameApi {
}
