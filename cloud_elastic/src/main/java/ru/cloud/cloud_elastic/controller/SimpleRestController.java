package ru.cloud.cloud_elastic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.cloud.cloud_elastic.document.Article;
import ru.cloud.cloud_elastic.service.ElasticsearchService;

import java.util.List;

/**
 * @author ddobrovolskiy
 * @since 30.11.2022
 */

@RestController
public class SimpleRestController {
    @Autowired private ElasticsearchService service;

    @GetMapping("/all")
    public List<Article> getAll() {
        return service.getAllArticle();
    }

    @GetMapping("/add")
    public void add() {
        service.addInfo();
    }

    @GetMapping("/del")
    public void del() {
        service.deleteAll();
    }

    @GetMapping("/name")
    public Page<Article> getName(@RequestParam("name") String name) {
        return service.getAllByName(name);
    }
}
