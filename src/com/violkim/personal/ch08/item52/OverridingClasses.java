package com.violkim.personal.ch08.item52;

import org.junit.Test;

import java.util.List;

public class OverridingClasses {
    class Wine {
        String name() { return "wine"; }
    }

    class SparklingWine extends Wine {
        @Override String name() { return "sparkling wine"; }
    }

    class Champagne extends SparklingWine {
        @Override String name() { return "champagne"; }
    }

    @Test
    public void overridingTest() {
        List<Wine> wineList = List.of(new Wine(), new SparklingWine(), new Champagne());

        for (Wine wine : wineList)
            System.out.println(wine.name());
    }
}