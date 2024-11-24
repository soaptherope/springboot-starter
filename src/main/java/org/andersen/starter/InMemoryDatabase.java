package org.andersen.starter;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class InMemoryDatabase {

    private final Map<String, Object> database = new HashMap<>();

    public void put(String key, Object value) {
        database.put(key, value);
    }

    public Object get(String key) {
        return database.get(key);
    }

    public void remove(String key) {
        database.remove(key);
    }

    public boolean containsKey(String key) {
        return database.containsKey(key);
    }

    public Map<String, Object> getAll() {
        return new HashMap<>(database);
    }
}
