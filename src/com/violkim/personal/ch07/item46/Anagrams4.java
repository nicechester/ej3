package com.violkim.personal.ch07.item46;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class Anagrams4 {
    // Tasteful use of streams enhances clarity and conciseness
    public static void main(String[] args) throws IOException {
        Path dictionary = Paths.get(args[0]);
        int minGroupSize = Integer.parseInt(args[1]);

        Map<String, Set<String>> groups = new HashMap<>();

        for (String word: iterableOf(Files.lines(dictionary))) {
                groups.computeIfAbsent(alphabetize(word),
                        (unused) -> new TreeSet<>()).add(word);
        }

        for (Set<String> group : groups.values())
            if (group.size() >= minGroupSize)
                System.out.println(group.size() + ": " + group);
    }

    // alphabetize method is the same as in original version
    private static String alphabetize(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }

    private static <E> Iterable<E> iterableOf(Stream<E> stream) {
        return stream::iterator;
    }
}
