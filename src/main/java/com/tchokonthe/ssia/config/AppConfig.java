package com.tchokonthe.ssia.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.repository.init.Jackson2RepositoryPopulatorFactoryBean;

/**
 * @author martin
 * @created on 05/12/2021 at 14:44
 * @project com.tchokonthe.ssia.config
 * @email (martin.aurele12 @ gmail.com)
 */


@Configuration
public class AppConfig {


    @Bean
    PersistenceExceptionTranslationPostProcessor postProcessor() {
        return new PersistenceExceptionTranslationPostProcessor();
    }

    @Bean
    Jackson2RepositoryPopulatorFactoryBean repositoryPopulator() {
        Jackson2RepositoryPopulatorFactoryBean factory = new Jackson2RepositoryPopulatorFactoryBean();
        factory.setResources(new Resource[] {new ClassPathResource("data.json")});
        return factory;
    }
}
