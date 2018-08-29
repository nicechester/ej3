package com.violkim.personal.ch10.item69;

import org.junit.Before;
import org.junit.Test;

public class EvenWorse {
    private static final int SIZE = 1000;
    private Runnable[] runs;

    @Before
    public void init() {
        final int[] ary = new int[100];
        runs = new Runnable[SIZE];
        for (int i=0; i<SIZE; i++) {
            final int ix = i;
            runs[i] = () -> System.out.println(ary[ix]);
        }
    }

    @Test
    public void nobodyKnowsWhatHappened() {
        try {
            int i = 0;
            while(true)
                runs[i++].run();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
