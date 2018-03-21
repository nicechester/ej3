package com.violkim.personal.ch05.item26;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WildCard {
    @Test
    public void testWildCard() {
        Set<?> si = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4));
//        si.add(1);
//        si.add("s");
    }

    @Test
    public void testInstanceof() {
        Set<?> o = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4));
        if (o instanceof Set) {       // Raw type
            Set<?> s = (Set<?>) o;    // Wildcard type
        }
    }

    @Test
    public void testSetObj() {
        Set<Object> so = new HashSet<>();
        so.add("Charlie");
        so.add(299);
        for (Object o: so) {
            System.out.println(o);
            if (o instanceof String) {
                System.out.println("It's a string!");
            } else if (o instanceof Integer) {
                System.out.println("It's an integer!");
            }
        }
    }
}
