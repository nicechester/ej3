package com.violkim.personal.ch01.item7;

import static junit.framework.TestCase.assertTrue;

import org.junit.Test;

import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

public class WeakHashMapExamples {
    @Test
    public void weakHashMapTests() throws InterruptedException {
        WeakHashMap<String, BigImage> map = new WeakHashMap<>();
        BigImage bigImage = new BigImage("image_id");
        String imageName = new String("name_of_big_image");
        map.put(imageName, bigImage);
        assertTrue(map.containsKey(imageName));
        System.out.println(map.keySet());

        imageName = null;
        System.gc();

        Thread.sleep(500);

        System.out.println(map.keySet());
    }

    private static class BigImage {
        private final String name;
        private final String[] image = new String[65535];
        public BigImage(String name) { this.name = name; }
        public String[] getImage() { return image; }
    }
}
