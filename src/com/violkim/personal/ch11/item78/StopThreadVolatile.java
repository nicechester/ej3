package com.violkim.personal.ch11.item78;

import org.junit.Test;

import java.time.Instant;

import static java.util.concurrent.TimeUnit.SECONDS;

public class StopThreadVolatile {
    private static volatile boolean stopRequested;

    @Test
    public void stopThread() throws InterruptedException {
        Thread backgroundThread = new Thread(() -> {
            long start = Instant.now().toEpochMilli();
            int i = 0;
            while (!stopRequested) {
                i++;
                if (i%10000 == 0)
                    System.out.printf("Run %d\n", i);
            }
            System.out.printf("\nIt took %d ms\n", Instant.now().toEpochMilli() - start);
        });

        backgroundThread.start();

        SECONDS.sleep(1);

        stopRequested = true;
    }
}
