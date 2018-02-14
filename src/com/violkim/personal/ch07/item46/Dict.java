package com.violkim.personal.ch07.item46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Dict {
    // Uses the streams API but not the paradigm--Don't do this!
//    private Map<String, Long> wordFrequencySideEffect(File file) throws FileNotFoundException {
//        final Map<String, Long> freq = new HashMap<>();
//        try (Stream<String> words = new Scanner(file).tokens()) {
//            words.forEach(word -> {
//                freq.merge(word.toLowerCase(), 1L, Long::sum);
//            });
//        }
//        return freq;
//    }
//
//    private Map<String, Long> wordFrequencyPureFunctional(File file) throws FileNotFoundException {
//        // Proper use of streams to initialize a frequency table
//        Map<String, Long> freq;
//        try (Stream<String> words = new Scanner(file).tokens()) {
//            freq = words.collect(groupingBy(String::toLowerCase, counting()));
//        }
//        return freq;
//    }

}
