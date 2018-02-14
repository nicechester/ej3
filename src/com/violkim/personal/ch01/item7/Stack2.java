package com.violkim.personal.ch01.item7;

import org.junit.Test;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack2 {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack2() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0)
            throw new EmptyStackException();
        Object obj = elements[--size];
        elements[size] = null;
        return obj;
    }

    /**
     * Ensure space for at least one more element, roughly
     * <p>
     * doubling the capacity each time the array needs to grow.
     */

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
            System.out.println("Bump up size to " + size);
        }
    }

    @Test
    public void stackTest() {
        Stack2 stack = new Stack2();
        for (long max=16; max<35651583; max*=2) {
            for (int j=0; j<max; j++) stack.push("Mark");
            for (int k=0; k<max; k++) stack.pop();
        }
    }
}
