package com.violkim.personal.ch05.item26;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RawTypeUnknownElemType {
    @Test
    public void test() {
        Set<Integer> si = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<String> ss = new HashSet<>(Arrays.asList("charlie", "brovo", "alpha"));
        System.out.println(numElementsInCommon(si, ss));
    }

    static int numElementsInCommon(Set s1, Set s2) {
        int result = 0;
        for (Object o1 : s1)
            if (s2.contains(o1))
                result++;
        return result;
    }
}
