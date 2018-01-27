package com.violkim.personal.ch07.item45;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class IterativeCartesianProduct {
    public enum Suit {diamond, club, heart, spade}
    public enum Rank {one, two, three, four, five, six, seven, eight, nine, ten, jack, queen, king}

    public static class Card {
        private Suit suit;
        private Rank rank;
        public Card(Suit suit, Rank rank) { this.suit = suit; this.rank = rank; }
        @Override public String toString() {
            return String.format("%s-%s", suit.name(), rank.name());
        }
    }

    // Iterative Cartesian product computation
    private static Collection<Card> newDeck() {
        Collection<Card> result = new ArrayList<>();
        for (Suit suit : Suit.values())
            for (Rank rank : Rank.values())
                result.add(new Card(suit, rank));

        return result;

    }

    // Stream-based Cartesian product computation
    private static Collection<Card> newDeck2() {
        return Stream.of(Suit.values())
                .flatMap(suit -> Stream.of(Rank.values())
                                       .map(rank -> new Card(suit, rank)))
                .collect(toList());
    }

    @Test
    public void testNewDeck() {
        Collection<?> deck = newDeck();
        System.out.println(deck);
    }

    @Test
    public void testNewDeck2() {
        Collection<?> deck = newDeck2();
        System.out.println(deck);
    }
}
