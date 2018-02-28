package com.violkim.personal.ch04.item16;

import org.junit.Test;

public class PointTest {
    @Test
    public void simple() {
        PointType p = new PointType();
        p.x = p.y = 10;
        System.out.printf("PointType(%f, %f)", p.x, p.y);
    }

    @Test
    public void withAccessors() {
        Point p = new Point(3, 4);
        System.out.printf("Point(%f, %f)", p.getX(), p.getY());
        p.setX(10);
        p.setY(100);
        System.out.printf("Point(%f, %f)", p.getX(), p.getY());
    }

    @Test
    public void testRgb() {
        Point p = new Point(10, 11);
        p.setRgb(33, 44, 55);
        p.rgb = new Point.ColorCodes();

    }
}
