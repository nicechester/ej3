package com.violkim.personal.ch01.item8;

import org.junit.Test;

public class RoomTest {

    @Test
    public void adult() {
        try (Room myRoom = new Room(7)) {
            System.out.println("Goodbye");
        }
    }

    @Test
    public void teenager() {
        new Room(99);
        System.out.println("Peace out");
    }

}
