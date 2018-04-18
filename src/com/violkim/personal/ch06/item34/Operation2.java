package com.violkim.personal.ch06.item34;

import java.util.Map;
import java.util.Optional;
import java.util.function.DoubleBinaryOperator;
import java.util.stream.Stream;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;

public enum Operation2 {
    PLUS("+", (x, y) -> x+y),
    MINUS("-", (x, y) -> x-y),
    TIMES("*", (x, y) -> x*y),
    DIVIDE("/", (x, y) -> x/y);

    private Operation2(String symbol, DoubleBinaryOperator applyFunction) {
        this.symbol = symbol;
        this.applyFunction = applyFunction;
    }

    private final String symbol;
    private final DoubleBinaryOperator applyFunction;
    public double apply(double x, double y) { return applyFunction.applyAsDouble(x, y); }

    @Override public String toString() { return symbol; }

    private static final Map<String, Operation2> stringToEnum =
            Stream.of(values()).collect(toMap(Object::toString, identity()));

    // Returns Operation for string, if any
    public static Optional<Operation2> fromString(String symbol) {
        return Optional.ofNullable(stringToEnum.get(symbol));
    }
}
