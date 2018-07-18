package com.violkim.personal.ch09.item61;

import org.junit.Test;

import java.util.Optional;

public class Unbelievable {
    private Integer i=42;

    @Test
    public void testEquality() {
        if (Optional.ofNullable(i).filter(ii -> ii==42).isPresent())
            System.out.println("Unbelievable");
    }

}
