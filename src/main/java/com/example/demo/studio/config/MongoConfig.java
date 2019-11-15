package com.example.demo.studio.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.client.MongoClients;

@Configuration
@EnableMongoAuditing
@EnableMongoRepositories(basePackages = "com.example.demo.studio.repo")
public class MongoConfig extends AbstractMongoClientConfiguration {
	
	@Value("${spring.data.mongodb.host}")
    private String host;

    @Value("${spring.data.mongodb.port}")
    private String port;
    
    @Value("${spring.data.mongodb.database}")
    private String database;

	@Override
	public com.mongodb.client.MongoClient mongoClient() {
		return MongoClients.create("mongodb://" + host + ":" + port + "/" + database);
	}

	@Override
	protected String getDatabaseName() {
		return database;
	}
	
}
