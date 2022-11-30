package ru.cloud.cloud_elastic.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import ru.cloud.cloud_elastic.document.Article;

import java.util.List;

/**
 * @author ddobrovolskiy
 * @since 28.11.2022
 */

@Repository
public interface ArticleRepository extends ElasticsearchRepository<Article, String> {

    @Override
    List<Article> findAll();

    Page<Article> findByAuthorsName(String name, Pageable pageable);

    @Query("{\"bool\": {\"must\": [{\"match\": {\"authors.name\": \"?0\"}}]}}")
    Page<Article> findByAuthorsNameUsingCustomQuery(String name, Pageable pageable);

    @Query("{\"bool\": {\"must\": {\"match_all\": {}}, \"filter\": {\"term\": {\"tags\": \"?0\" }}}}")
    Page<Article> findByFilteredTagQuery(String tag, Pageable pageable);

    @Query("{\"bool\": {\"must\": {\"match\": {\"authors.name\": \"?0\"}}, \"filter\": {\"term\": {\"tags\": \"?1\" }}}}")
    Page<Article> findByAuthorsNameAndFilteredTagQuery(String name, String tag, Pageable pageable);
}
