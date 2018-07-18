package com.violkim.personal.ch10.item69;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorFun {
    private Collection<Integer> collection;

    @Before
    public void init() {
        collection = new ArrayList<>();
        for (int i=0; i<100; i++)
            collection.add((100-i)*2);
    }

    @Test
    public void iteratorException() {
        try {
            Iterator<Integer> i = collection.iterator();
            while(true) {
                Integer ii = i.next();
                System.out.println(ii);
            }

        } catch (NoSuchElementException e) {

        }
    }
}
