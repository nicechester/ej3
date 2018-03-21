package com.violkim.personal.ch05.item27;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class GenericsRelatedWarnings {
    private static class Lark {}

    @Test
    public void uncheckedConversionWarning() {
        Set<Lark> exaltation = new HashSet();
    }

    @Test
    public void useDiamondNotationInJava7() {
        Set<Lark> exaltation = new HashSet<>();
    }

}
