package com.violkim.personal.ch04.item16;

import org.junit.Test;

public class TimeTest {
    @Test
    public void testTime() {
        Time t = new Time(10, 35);
        System.out.printf("%d:%d", t.hour, t.minute);
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidHour() {
        Time t = new Time(25, 20);
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidMin() {
        Time t = new Time(22, 61);
    }
}
