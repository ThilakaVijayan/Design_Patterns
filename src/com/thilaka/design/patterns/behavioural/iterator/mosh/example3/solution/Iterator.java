package com.thilaka.design.patterns.behavioural.iterator.mosh.example3.solution;

public interface Iterator {
  boolean hasNext();
  Product current();
  void next();
}
