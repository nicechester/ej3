package com.violkim.personal.ch07.item47;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Collections.emptyList;

public class SubLists {
    public static <E> Stream<List<E>> of(List<E> list) {
        return Stream.concat(Stream.of(emptyList()),
                prefixes(list).flatMap(SubLists::suffixes));
    }

    private static <E> Stream<List<E>> prefixes(List<E> list) {
        return IntStream.rangeClosed(1, list.size())
                .mapToObj(end -> list.subList(0, end));
    }

    private static <E> Stream<List<E>> suffixes(List<E> list) {
        return IntStream.range(0, list.size())
                .mapToObj(start -> list.subList(start, list.size()));
    }

    @Test
    public void testSubLists() {
        List<?> l = Arrays.asList(1, 2, 3, 4, 5, 6);
        SubLists.of(l).forEach(System.out::println);
    }

    @Test
    public void useCollection() {
        List<?> l = Arrays.asList(1, 2, 3, 4, 5, 6);
        for (int start = 0; start < l.size(); start++)
            for (int end = start + 1; end <= l.size(); end++)
                System.out.println(l.subList(start, end));
    }

    public static <E> Stream<List<E>> of2(List<E> list) {
        return IntStream.range(0, list.size())
                .mapToObj(start ->
                        IntStream.rangeClosed(start + 1, list.size())
                                .mapToObj(end -> list.subList(start, end)))
                .flatMap(x -> x);
    }

    @Test
    public void testOf2() {
        List<?> l = Arrays.asList(1, 2, 3, 4, 5, 6);
        SubLists.of2(l).forEach(System.out::println);
    }
}
