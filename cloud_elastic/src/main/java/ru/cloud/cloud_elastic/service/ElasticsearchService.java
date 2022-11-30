package ru.cloud.cloud_elastic.service;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.cloud.cloud_elastic.document.Article;
import ru.cloud.cloud_elastic.document.Author;
import ru.cloud.cloud_elastic.repository.ArticleRepository;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * @author ddobrovolskiy
 * @since 28.11.2022
 */

@Service
public class ElasticsearchService {
    @Autowired private RestHighLevelClient elasticsearchTemplate;
    @Autowired private ArticleRepository articleRepository;

    @Transactional
    public void addInfo() {
        Author johnSmith = new Author("John Smith");
        Author johnDoe = new Author("John Doe");

        Article article = new Article("Spring Data Elasticsearch");
        article.setAuthors(asList(johnSmith, johnDoe));
        article.setTags("elasticsearch", "spring data");
        articleRepository.save(article);

        article = new Article("Search engines");
        article.setAuthors(asList(johnDoe));
        article.setTags("search engines", "tutorial");
        articleRepository.save(article);

        article = new Article("Second Article About Elasticsearch");
        article.setAuthors(asList(johnSmith));
        article.setTags("elasticsearch", "spring data");
        articleRepository.save(article);

        article = new Article("Elasticsearch Tutorial");
        article.setAuthors(asList(johnDoe));
        article.setTags("elasticsearch");
        articleRepository.save(article);
    }

    @Transactional
    public void deleteAll() {
        articleRepository.deleteAll();
    }

    @Transactional
    public List<Article> getAllArticle() {
        return articleRepository.findAll();
    }


    @Transactional
    public Page<Article> getAllByName(String name) {
        return articleRepository.findByAuthorsName(name, Pageable.unpaged());
    }
}
