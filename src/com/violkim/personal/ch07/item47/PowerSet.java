package com.violkim.personal.ch07.item47;

import org.junit.Test;

import java.util.*;

public class PowerSet {
    public static final <E> Collection<Set<E>> of(Set<E> s) {
        final List<E> src = new ArrayList<>(s);

        if (src.size() > 30)
            throw new IllegalArgumentException("Set too big " + s);

        return new AbstractList<Set<E>>() {
            @Override public int size() { return 1 << src.size(); } // which makes 2^n
            @Override public boolean contains(Object o) { return o instanceof Set && src.containsAll((Set) o); }
            @Override public Set<E> get(int index) {
                Set<E> result = new HashSet<>();
                for (int i = 0; index != 0; i++, index >>= 1)
                    if ((index & 1) == 1)
                        result.add(src.get(i));
                return result;
            }
        };
    }

    @Test
    public void testPowerSet() {
        Set<String> set = new HashSet<>() {{ add("a"); add("b"); add("c"); add("mark");}};
        Collection<?> powerSet = PowerSet.of(set);
        System.out.println(powerSet);
    }
}
