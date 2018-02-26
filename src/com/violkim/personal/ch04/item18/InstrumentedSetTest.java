package com.violkim.personal.ch04.item18;

import org.junit.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static java.time.LocalDate.now;

public class InstrumentedSetTest {
    @Test
    public void happyPath() {
        InstrumentedSet<String> s = new InstrumentedSet<>(new HashSet<>(100));
        s.add("mark");
        s.add("chester");
        s.add("xin");
        System.out.println("Size of set is " + s.getAddCount());
    }

    @Test
    public void notBrokenInitializerAnymore() {
        InstrumentedSet<String> s = new InstrumentedSet<>(new HashSet<>());
        s.addAll(List.of("mark", "chester", "xin")); // Java 9
        System.out.println("Size of set is " + s.getAddCount());
    }

    @Test
    public void flexibility() {
        Set<LocalDate> dates = new InstrumentedSet<>(new TreeSet<>());
        dates.add(now());
        dates.add(LocalDate.of(2019, 1, 23));
        dates.add(LocalDate.of(2018, 1, 23));
        dates.add(LocalDate.of(2018, 11, 1));
        System.out.println("Size of set is " + ((InstrumentedSet<LocalDate>)dates).getAddCount());
        System.out.println("dates are " + dates);
    }
}
