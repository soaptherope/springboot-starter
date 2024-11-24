package org.andersen.starter;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class InMemoryRepositoryImpl<T> implements InMemoryRepository<T> {

    private final InMemoryDatabase inMemoryDatabase;

    public InMemoryRepositoryImpl(InMemoryDatabase inMemoryDatabase) {
        this.inMemoryDatabase = inMemoryDatabase;
    }

    @Override
    public T save(T entity) {
        inMemoryDatabase.put(entity);
        return entity;
    }

    @Override
    public Optional<T> findById(Long id) {
        return Optional.ofNullable((T) inMemoryDatabase.get(id));
    }

    @Override
    public void deleteById(Long id) {
        inMemoryDatabase.remove(id);
    }

    @Override
    public boolean existsById(Long id) {
        return inMemoryDatabase.containsKey(id);
    }
}
