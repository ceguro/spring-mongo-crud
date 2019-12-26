package com.example.springmongocrud.configuration;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import java.net.UnknownHostException;

@Configuration
public class MongoConfig {

    @Bean
    public MongoDbFactory getMongoDbFactory() {
        return new SimpleMongoDbFactory(new MongoClient("localhost",27017),"mongotest");
    }
    @Bean(name = "mongoTemplate")
    public MongoTemplate getMongoTemplate() {
       return new MongoTemplate(getMongoDbFactory());
    }


}
