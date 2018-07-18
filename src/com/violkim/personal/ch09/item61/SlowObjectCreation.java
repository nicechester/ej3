package com.violkim.personal.ch09.item61;

import org.junit.Test;

import java.time.Instant;

public class SlowObjectCreation {
    @Test
    public void Slowness() {
        long start = now();
        Long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.printf("Boxed: duration = %d ms\n", now() - start);
    }

    @Test
    public void NotSoSlow() {
        long start = now();
        long sum = 0L;
        Integer maxInt = Integer.MAX_VALUE;
        for (long i = 0; i < maxInt; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.printf("Primitive: duration = %d ms\n", now() - start);
    }

    private static long now() { return Instant.now().toEpochMilli(); }
}
