package com.violkim.personal.ch04.item18;

import com.violkim.personal.ch04.item16.Point;
import org.junit.Test;

public class PackagePrivateTest {
    @Test
    public void testRgb() {
        Point p = new Point(10, 11);
        p.setRgb(33, 44, 55);
   //     p.rgb = new Point.ColorCodes();

    }
}
