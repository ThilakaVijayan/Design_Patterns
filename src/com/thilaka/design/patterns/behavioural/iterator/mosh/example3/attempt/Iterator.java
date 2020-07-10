package com.thilaka.design.patterns.behavioural.iterator.mosh.example3.attempt;

public interface Iterator<T> {
    boolean hasNext();
    T current();
    void next();
}
