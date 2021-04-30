package com.benwarrick.RESTClientPOC;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class RestClientPocApplication {
	private static final Logger LOG = LoggerFactory.getLogger(RestClientPocApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = 
		SpringApplication.run(RestClientPocApplication.class, args);
		String mongoDBHost = ctx.getEnvironment().getProperty("spring.data.mongodb.host");
		String mongoDbPort = ctx.getEnvironment().getProperty("spring.data.mongodb.port");
		LOG.info("Connected to MongoDb: " + mongoDBHost + ":" + mongoDbPort); 
	}

}
