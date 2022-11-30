package ru.cloud.cloud_elastic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories
public class CloudElasticApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudElasticApplication.class, args);
    }

}
