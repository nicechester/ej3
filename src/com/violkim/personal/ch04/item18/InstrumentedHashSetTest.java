package com.violkim.personal.ch04.item18;

import org.junit.Test;

import java.util.List;

public class InstrumentedHashSetTest {
    @Test
    public void happyPath() {
        InstrumentedHashSet<String> s = new InstrumentedHashSet<>();
        s.add("mark");
        s.add("chester");
        s.add("xin");
        System.out.println("Size of set is " + s.getAddCount());
    }

    @Test
    public void brokenInitializer() {
        InstrumentedHashSet<String> s = new InstrumentedHashSet<>();
        s.addAll(List.of("mark", "chester", "xin")); // Java 9
        System.out.println("Size of set is " + s.getAddCount());
    }
}
