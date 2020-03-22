package com.producthunt.corona;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Author : rajan
 * Date : 2020-03-22
 */


@Configuration
@ComponentScan({"com.producthunt.*"})
@PropertySource("classpath:application.properties")
@EnableWebMvc
public class CoronaAppConfig {

    @Bean
    public MongoClient mongo() {
        return MongoClients.create();
    }

    @Bean
    public MongoTemplate mongoTemplate() {
        return new MongoTemplate(mongo(), "producthunt");
    }

}
