package com.violkim.personal.ch04.item17;

import static com.violkim.personal.ch04.item17.Complex.*;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class ComplexTest {

    @Test
    public void testOps() {
        Complex c1 = Complex.valueOf(10, 9);
        Complex c2 = Complex.valueOf(1, 1);
        Complex c3 = c1.plus(c2);
        Complex c4 = c3.dividedBy(c2);
        assertNotEquals(c1, c4);
    }

    @Test
    public void commonValues() {
        Complex c = I.plus(ONE.times(ZERO));
        System.out.println(c);
    }
}
