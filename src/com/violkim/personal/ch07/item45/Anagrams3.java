package com.violkim.personal.ch07.item45;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class Anagrams3 {
    // Tasteful use of streams enhances clarity and conciseness
    public static void main(String[] args) throws IOException {
        final Path dictionary = Paths.get(args[0]);
        AtomicReference<Integer> minGroupSize = new AtomicReference<>(Integer.parseInt(args[1]));

        try (Stream<String> words = Files.lines(dictionary)) {
            words.collect(groupingBy(word -> alphabetize(word)))
                    .values().stream()
                    .peek(g -> minGroupSize.set(1))
                    .filter(group -> group.size() >= minGroupSize.get())
                    .forEach(g -> System.out.println(g.size() + ": " + g));
        }
    }

    // alphabetize method is the same as in original version
    private static String alphabetize(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}
