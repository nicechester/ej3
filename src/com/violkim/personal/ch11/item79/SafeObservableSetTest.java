package com.violkim.personal.ch11.item79;

import org.junit.Test;

import java.util.HashSet;
import java.util.function.BiConsumer;

public class SafeObservableSetTest {
    @Test
    public void goodTest() {
        SafeObservableSet<Integer> set = new SafeObservableSet<>(new HashSet<>());
        set.addObserver((s, e) -> System.out.printf("%s ", e));
        for (int i = 0; i < 100; i++)
            set.add(i);
    }

    @Test
    public void fancy() {
        SafeObservableSet<Integer> set = new SafeObservableSet<>(new HashSet<>());
        set.addObserver(new SafeSetObserver<>() {
            public void added(SafeObservableSet<Integer> s, Integer e) {
                System.out.printf("%s ", e);
                if (23 == e)
                    s.removeObserver(this);
            }
        });

        for (int i = 0; i < 100; i++)
            set.add(i);

    }

    @Test
    public void fancy2() {
        SafeObservableSet2<Integer> set = new SafeObservableSet2<>(new HashSet<>());
        set.addObserver(new BiConsumer<SafeObservableSet2<Integer>, Integer>() {
            @Override
            public void accept(SafeObservableSet2<Integer> s, Integer e) {
                System.out.printf("%s ", e);
                if (23 == e)
                    s.removeObserver(this);
            }
        });

        for (int i = 0; i < 100; i++)
            set.add(i);

    }

}
