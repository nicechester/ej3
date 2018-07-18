package com.violkim.personal.ch09.item61;

import org.junit.Test;

import java.util.Comparator;

public class BoxedTypeComparator {
    public static Comparator<Integer> naturalOrder = (i, j) -> (i < j) ? -1 : (i == j ? 0 : 1);

    @Test
    public void testBoxedTypes() {
        System.out.println(naturalOrder.compare(1, 3));
        System.out.println(naturalOrder.compare(3, 1));
        System.out.println(naturalOrder.compare(-1, 255));
        System.out.println(naturalOrder.compare(1, 1));
        Integer a=new Integer(1), b=new Integer(1);
        System.out.println(naturalOrder.compare(a, b));
        System.out.println(naturalOrder.compare(null, null));
    }

    public static Comparator<Integer> naturalOrder2 = (iBoxed, jBoxed) -> {
        if (iBoxed==null || jBoxed==null) {
            return (iBoxed==null && jBoxed==null) ? 0 : 1;
        }
        int i = iBoxed, j = jBoxed; // Auto-unboxing
        return i < j ? -1 : (i == j ? 0 : 1);
    };

    @Test
    public void testBoxedTypesUnboxed() {
        System.out.println(naturalOrder2.compare(1, 3));
        System.out.println(naturalOrder2.compare(3, 1));
        System.out.println(naturalOrder2.compare(-1, 255));
        System.out.println(naturalOrder2.compare(1, 1));
        Integer a=new Integer(1), b=new Integer(1);
        System.out.println(naturalOrder2.compare(a, b));
        System.out.println(naturalOrder2.compare(null, null));
        System.out.println(naturalOrder2.compare(null, b));
        System.out.println(naturalOrder2.compare(b, null));
    }
    
}
