package com.github.tusharepro.persistence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EntityScan(basePackages = {"com.github.tusharepro.core.entity"})
@EnableJpaRepositories(basePackages={"com.github.tusharepro.persistence.repository"})
@EnableScheduling
public class TushareProPersistenceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TushareProPersistenceApplication.class, args);
    }

}