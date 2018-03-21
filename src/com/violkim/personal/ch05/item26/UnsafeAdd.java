package com.violkim.personal.ch05.item26;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class UnsafeAdd {
    @Test
    public void testUnsafeAdd() {
        List<String> strings = new ArrayList<>();
        unsafeAdd(strings, Integer.valueOf(42));
        String s = strings.get(0); // Has compiler-generated cast
    }

    private static void unsafeAdd(List list, Object o) {
        list.add(o);
    }
}
