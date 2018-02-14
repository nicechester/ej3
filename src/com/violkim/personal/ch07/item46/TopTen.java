package com.violkim.personal.ch07.item46;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class TopTen {
    public List<String> getTopTen(Map<String, Integer> freq) {
        // Pipeline to get a top-ten list of words from a frequency table
        return freq.keySet().stream()
                .sorted(comparing(freq::get).reversed())
                .limit(10)
                .collect(toList());
    }

    @Test
    public void testFreq() {
        Map<String, Integer> freq = new HashMap<String, Integer>() {{
            put("flower", 50);
            put("love", 100);
            put("friend", 80);
            put("father", 81);
            put("mother", 99);
            put("gentleman", 2);
            put("girl", 30);
            put("kid", 98);
            put("money", 31);
            put("job", 29);
            put("cute", 79);
            put("work", 55);
            put("news", 3);
        }};
        List<?> top10 = getTopTen(freq);
        System.out.println(top10);
    }
}
