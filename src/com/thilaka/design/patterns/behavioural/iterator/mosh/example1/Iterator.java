package com.thilaka.design.patterns.behavioural.iterator.mosh.example1;

public interface Iterator<T> {
    boolean hasNext();
    T current();
    void next();
}
