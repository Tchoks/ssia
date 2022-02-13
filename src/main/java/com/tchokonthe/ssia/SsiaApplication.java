package com.tchokonthe.ssia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = {"com.tchokonthe.ssia.repository"})
public class SsiaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsiaApplication.class, args);
    }

}
