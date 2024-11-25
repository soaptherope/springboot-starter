package org.andersen.starter;

import java.util.Optional;

public interface InMemoryRepository<T> {
    T save(T entity);
    Optional<T> findById(Long id);
    void deleteById(Long id);
    boolean existsById(Long id);
}
