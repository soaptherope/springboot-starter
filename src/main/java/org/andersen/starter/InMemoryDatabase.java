package org.andersen.starter;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class InMemoryDatabase {

    private final Map<Long, Object> database = new HashMap<>();

    public void put(Long key, Object value) {
        database.put(key, value);
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
        return new HashMap<>(database);
    }
}
