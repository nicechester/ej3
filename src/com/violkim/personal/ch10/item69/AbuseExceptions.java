package com.violkim.personal.ch10.item69;

import org.junit.Before;
import org.junit.Test;

import java.time.Instant;

public class AbuseExceptions {
    private static final int SIZE = 10000000;
    private Range[] range;
    private static int counter = 0;

    class Range { void climb() { counter++; } }

    @Before
    public void init() {
        counter = 0;
        range = new Range[SIZE];
        for (int i=0; i<SIZE; i++)
            range[i] = new Range();
    }

    @Test
    public void horrible() {
        long start = Instant.now().toEpochMilli();
        try {
            int i = 0;
            while(true)
                range[i++].climb();
        } catch (ArrayIndexOutOfBoundsException e) {

        }
        System.out.printf("Horrible took %d ms\n", Instant.now().toEpochMilli() - start);
    }

    @Test
    public void normal() {
        long start = Instant.now().toEpochMilli();
        for (Range r: range) {
            r.climb();
        }
        System.out.printf("Normal took %d ms\n", Instant.now().toEpochMilli() - start);
    }
}
