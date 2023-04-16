package ru.cloud.facade.controllers;

import reactor.core.publisher.Mono;
import ru.cloud.facade.services.NamedAsyncService;
import ru.cloud.facade.services.NamedProxyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import ru.api.NameApi;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;

@RestController
public class NamedRestController implements NameApi {

    @Autowired private NamedAsyncService service;
    @Autowired private NamedProxyService namedProxyService;
    private static ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());

    @Override
    public List<String> getName() {
        return getList();
    }

    @Override
    public List<String> getName2() {
        return getList();
    }

    private List<String> getList() {
        System.out.println("facade");
        System.out.println(forkJoinPool.getActiveThreadCount());
        System.out.println(forkJoinPool.getPoolSize());
        Mono<List<String>> addataMono = Mono.fromFuture(new CompletableFuture<List<String>>()
                .completeAsync(() -> namedProxyService.getName()));
//        Mono<List<String>> addataMono = Mono.fromFuture(service.getNamedAsync());
//        Mono<List<String>> addataMono = Mono.just(namedProxyService.getName());
        return Mono.just(getNames()).flatMapIterable(list -> list)
                .concatWith(addataMono.flatMapIterable(list -> list))
                .map(String::toUpperCase)
                .collectList()
                .block();
    }

    private List<String> getNames() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return List.of("FACADE");
    }
}
