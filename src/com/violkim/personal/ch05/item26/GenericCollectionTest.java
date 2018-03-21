package com.violkim.personal.ch05.item26;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericCollectionTest {
    private static class Stamp {}
    private static class Coin {}

    @Test
    public void testRawType() {
        Collection stamps = new ArrayList();
        stamps.add(new Coin());

        for (Iterator i = stamps.iterator(); i.hasNext(); ) {
            Stamp stamp = (Stamp) i.next(); // Throws ClassCastException
            System.out.println(stamp);
        }
    }

    @Test
    public void paramStamps() {
        Collection<Stamp> stamps = new ArrayList<>();
//        stamps.add(new Coin());
    }
}
