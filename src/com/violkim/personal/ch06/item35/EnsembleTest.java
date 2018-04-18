package com.violkim.personal.ch06.item35;

import org.junit.Test;

public class EnsembleTest {
    @Test
    public void testOrdinal() {
        for (EnsembleOrdinal ensemble: EnsembleOrdinal.values()) {
            System.out.printf("Number of musicians of %s is %d\n", ensemble, ensemble.numberOfMusicians());
        }
    }


    @Test
    public void testEnsemble() {
        for (Ensemble ensemble: Ensemble.values()) {
            System.out.printf("Number of musicians of %s is %d\n", ensemble, ensemble.numberOfMusicians());
        }
    }
}
