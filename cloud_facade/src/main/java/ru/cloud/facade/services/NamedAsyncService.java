package ru.cloud.facade.services;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

@Service
public class NamedAsyncService {
    @Autowired
    private NamedProxyService namedProxyService;

    @Async
    public CompletableFuture<List<String>> getNamedAsync() {
        System.out.println(Thread.currentThread().getName());
        return CompletableFuture.supplyAsync(() -> namedProxyService.getName());
    }
}
