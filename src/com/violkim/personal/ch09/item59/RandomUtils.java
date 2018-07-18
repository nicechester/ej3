package com.violkim.personal.ch09.item59;

import org.junit.Test;

import java.time.Instant;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {
    static Random rnd = new Random();

    public static int random(int n) {
        return Math.abs(rnd.nextInt()) % n;
    }

    @Test
    public void testRandom() {
        for (int i=0; i<1000; i++)
            System.out.printf(" %d ", random(100));
        System.out.println();
    }

    @Test
    public void howManyLowerHalf() {
        int n = 2 * (Integer.MAX_VALUE / 3);
        int low = 0;
        for (int i = 0; i < 1000000; i++)
            if (random(n) < n/2)
                low++;
        System.out.println(low);
    }

    @Test
    public void useLibrary() {
        int n = 2 * (Integer.MAX_VALUE / 3);
        int low = 0;
        long start = now();
        for (int i = 0; i < 1000000; i++)
            if (rnd.nextInt(n) < n/2)
                low++;
        System.out.println(low);
        System.out.printf("Random: duration = %d \n", now() - start);
    }

    @Test
    public void useThreadLocalRandom() {
        ThreadLocalRandom rnd2 = ThreadLocalRandom.current();
        int n = 2 * (Integer.MAX_VALUE / 3);
        int low = 0;
        long start = now();
        for (int i = 0; i < 1000000; i++)
            if (rnd2.nextInt(n) < n/2)
                low++;
        System.out.println(low);
        System.out.printf("ThreadLocalRandom: duration = %d \n", now() - start);
    }

    private static long now() { return Instant.now().toEpochMilli(); }
}
