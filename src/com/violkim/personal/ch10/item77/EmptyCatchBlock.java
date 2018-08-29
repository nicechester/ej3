package com.violkim.personal.ch10.item77;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EmptyCatchBlock {

    @Test
    public void ignoreException() {
        try {
            FileInputStream fis = new FileInputStream("src/com/violkim/personal/ch10/item77/EmptyCatchblock.java");
            int c;
            while ((c = fis.read()) != -1) {
                System.out.print((char)c);
            }
            fis.close();
        } catch(Exception e) {
            // Ignore!
        }
    }

    @Test
    public void handleException() {
        try {
            FileInputStream fis = new FileInputStream("src/com/violkim/personal/ch10/item77/EmptyCatchBlock.java");
            int c;
            while ((c = fis.read()) != -1) {
                System.out.print((char)c);
            }
        } catch(IOException e) {
            System.err.print(e);
        }
    }

}
