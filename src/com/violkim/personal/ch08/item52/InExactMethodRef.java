package com.violkim.personal.ch08.item52;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InExactMethodRef {
    @Test
    public void threadThreadPool() {
        new Thread(System.out::println).start();

        ExecutorService exec = Executors.newCachedThreadPool();
//        exec.submit(System.out::println);
    }


}
