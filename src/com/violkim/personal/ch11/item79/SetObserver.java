package com.violkim.personal.ch11.item79;

@FunctionalInterface
public interface SetObserver<E> {
    void added(ObservableSet<E> set, E element);
}
