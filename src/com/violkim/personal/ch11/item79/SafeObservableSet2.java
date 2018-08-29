package com.violkim.personal.ch11.item79;

import com.violkim.personal.ch04.item18.ForwardingSet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.BiConsumer;

public class SafeObservableSet2<E> extends ForwardingSet<E> {
    public SafeObservableSet2(Set<E> set) {
        super(set);
    }

    private final List<BiConsumer<SafeObservableSet2<E>, E>> observers = new CopyOnWriteArrayList<>();

    public void addObserver(BiConsumer<SafeObservableSet2<E>, E> observer) {
        synchronized (observers) {
            observers.add(observer);
        }
    }

    public boolean removeObserver(BiConsumer<SafeObservableSet2<E>, E> observer) {
        synchronized (observers) {
            return observers.remove(observer);
        }
    }

    private void notifyElementAdded(E element) {
        synchronized (observers) {
            for (BiConsumer<SafeObservableSet2<E>, E> observer : observers)
                observer.accept(this, element);
        }
    }

    @Override
    public boolean add(E element) {
        boolean added = super.add(element);
        if (added)
            notifyElementAdded(element);
        return added;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean result = false;
        for (E element : c)
            result |= add(element);  // Calls notifyElementAdded
        return result;
    }
}