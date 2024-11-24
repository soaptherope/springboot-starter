package org.andersen.starter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InMemoryRepositoryConfiguration {

    @Bean
    public <T> InMemoryRepository<T> inMemoryRepository(InMemoryDatabase inMemoryDatabase) {
        return new InMemoryRepositoryImpl<>(inMemoryDatabase);
    }
}
