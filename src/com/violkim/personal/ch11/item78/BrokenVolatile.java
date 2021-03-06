package com.violkim.personal.ch11.item78;

import org.junit.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class BrokenVolatile {
    private static volatile int nextSerialNumber = 0;

    private static int generateSerialNumber() {
        return nextSerialNumber++;
    }

    @Test
    public void breakVolatileCounter() throws InterruptedException {
        Executor executor = Executors.newFixedThreadPool(100);
        CountDownLatch countDown = new CountDownLatch(10000);
        for (int i=0; i<10000; i++)
            executor.execute(() -> {
                System.out.println("Serial number = " + generateSerialNumber());
                countDown.countDown();
            });
        countDown.await();
    }
}
