package ru.cloud.cloud_elastic;

/**
 * @author ddobrovolskiy
 * @since 28.11.2022
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.ObjectInputFilter;

/**
 * This Manual test requires: Elasticsearch instance running on localhost:9200.
 *
 * The following docker command can be used: docker run -d --name es762 -p 9200:9200 -e "discovery.type=single-node" -e "http.cors.enabled=true" -e "http.cors.allow-origin=http://localhost:10101" elasticsearch:7.6.2
 * docker run -d --name elasticvue -p 10101:8080 cars10/elasticvue
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ObjectInputFilter.Config.class)
public class SpringContextManualTest {
    @Test
    public void whenSpringContextIsBootstrapped_thenNoExceptions() {
    }
}
