package org.andersen.starter;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class InMemoryDatabase {

    private final Map<Long, Object> database = new ConcurrentHashMap<>();

    private final KeyGenerator keyGenerator;

    public InMemoryDatabase(KeyGenerator keyGenerator) {
        this.keyGenerator = keyGenerator;
    }

    public Long put(Object value) {
        Long key = keyGenerator.generateKey();
        database.put(key, value);
        return key;
    }

    public Object get(Long key) {
        return database.get(key);
    }

    public void remove(Long key) {
        database.remove(key);
    }

    public boolean containsKey(Long key) {
        return database.containsKey(key);
    }

    public Map<Long, Object> getAll() {
        return new ConcurrentHashMap<>(database);
    }
}
