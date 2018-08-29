package com.violkim.personal.ch10.item77;

import org.junit.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

import static java.util.concurrent.TimeUnit.SECONDS;

public class IgnoreExceptionWithComment {
    @Test
    public void ignoreExceptionWithComment() {
        AtomicInteger i = new AtomicInteger(0);
        Future<Integer> f = Executors.newSingleThreadExecutor().submit(() -> i.incrementAndGet());
        int num = 4;
        try {
            num = f.get(1L, SECONDS);
        } catch (TimeoutException | ExecutionException | InterruptedException ignored) {
            // Use default: minimal coloring is desirable, not required
        }
    }
}
