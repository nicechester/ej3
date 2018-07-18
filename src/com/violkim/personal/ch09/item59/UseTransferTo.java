package com.violkim.personal.ch09.item59;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

// Java 9
public class UseTransferTo {
    @Test
    public void testTransferTo() throws IOException {
        try (InputStream in = new URL("https://disneyworld.disney.go.com/profile").openStream()) {
            in.transferTo(System.out);
        }
    }
}
