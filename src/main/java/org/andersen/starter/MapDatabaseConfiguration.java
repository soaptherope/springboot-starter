package org.andersen.starter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapDatabaseConfiguration {

    @Bean
    public InMemoryDatabase inMemoryDatabase(KeyGenerator keyGenerator) {
        return new InMemoryDatabase(keyGenerator);
    }
}
