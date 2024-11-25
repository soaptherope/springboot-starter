package org.andersen.starter;

import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class KeyGenerator {

    private final AtomicLong counter = new AtomicLong(0);

    public Long generateKey() {
        return counter.incrementAndGet();
    }
}
