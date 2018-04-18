package com.violkim.personal.ch06.item34;

import org.junit.Test;

import static org.junit.Assert.*;

public class OperationTest {
    @Test
    public void testOperation1() {
        double x = 8;
        double y = 3;
        for (Operation1 op : Operation1.values())
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
    }

    @Test
    public void testOperation2() {
        double x = 8;
        double y = 3;
        for (Operation2 op : Operation2.values())
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
    }
}