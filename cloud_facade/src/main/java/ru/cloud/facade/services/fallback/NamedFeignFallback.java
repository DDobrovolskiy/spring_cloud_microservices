package ru.cloud.facade.services.fallback;

import org.springframework.stereotype.Component;
import ru.cloud.facade.services.NamedFeignService;

/**
 * @author ddobrovolskiy
 * @since 19.09.2022
 */

//@Component
public class NamedFeignFallback implements NamedFeignService {
    @Override
    public String getName() {
        System.out.println("503 - Server not available");
        return "Server not available";
    }
}
