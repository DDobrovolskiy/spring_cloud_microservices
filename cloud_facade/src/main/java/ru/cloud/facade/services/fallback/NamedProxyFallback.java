package ru.cloud.facade.services.fallback;

import ru.cloud.facade.services.NamedProxyService;

/**
 * @author ddobrovolskiy
 * @since 19.09.2022
 */

//@Component
public class NamedProxyFallback implements NamedProxyService {
    @Override
    public String getName() {
        System.out.println("503 - Server not available");
        return "Server not available";
    }
}
