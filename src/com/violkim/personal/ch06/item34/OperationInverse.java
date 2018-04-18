package com.violkim.personal.ch06.item34;

import org.junit.Test;

import java.util.Arrays;

import static com.violkim.personal.ch06.item34.Operation2.*;

public class OperationInverse {
    // Switch on an enum to simulate a missing method
    public static Operation2 inverse(Operation2 op) {
        switch(op) {
            case PLUS:   return MINUS;
            case MINUS:  return PLUS;
            case TIMES:  return DIVIDE;
            case DIVIDE: return TIMES;

            default:  throw new AssertionError("Unknown op: " + op);
        }
    }

    @Test
    public void inverseTest() {
        Arrays.stream(Operation2.values())
                .forEach(o -> System.out.printf("inverse(%s) is %s. %f, %f\n", o, inverse(o), o.apply(10, 8), inverse(o).apply(10, 8)));
    }
}
