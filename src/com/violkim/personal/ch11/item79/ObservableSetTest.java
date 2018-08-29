package com.violkim.personal.ch11.item79;

import org.junit.Test;

import java.util.HashSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ObservableSetTest {
    @Test
    public void goodTest() {
        ObservableSet<Integer> set = new ObservableSet<>(new HashSet<>());
        set.addObserver((s, e) -> System.out.printf("%s ", e));
        for (int i = 0; i < 100; i++)
            set.add(i);
    }

    @Test
    public void fancy() {
        ObservableSet<Integer> set = new ObservableSet<>(new HashSet<>());
        set.addObserver(new SetObserver<>() {
            public void added(ObservableSet<Integer> s, Integer e) {
                System.out.printf("%s ", e);
                if (23 == e)
                    s.removeObserver(this);
            }
        });

        for (int i = 0; i < 100; i++)
            set.add(i);

    }

    @Test
    public void odd() {
        ObservableSet<Integer> set = new ObservableSet<>(new HashSet<>());
        set.addObserver(new SetObserver<>() {
            @Override
            public void added(ObservableSet<Integer> s, Integer e) {
                System.out.println(e);
                if (e == 23) {
                    ExecutorService exec = Executors.newSingleThreadExecutor();
                    try {
                        exec.submit(() -> s.removeObserver(this)).get();
                    } catch (ExecutionException | InterruptedException ex) {
                        throw new AssertionError(ex);
                    } finally {
                        exec.shutdown();
                    }
                }
            }
        });

        for (int i = 0; i < 100; i++)
            set.add(i);
    }
}
