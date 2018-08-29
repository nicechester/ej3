package com.violkim.personal.ch11.item79;

@FunctionalInterface
public interface SafeSetObserver<E> {
    void added(SafeObservableSet<E> set, E element);
}
