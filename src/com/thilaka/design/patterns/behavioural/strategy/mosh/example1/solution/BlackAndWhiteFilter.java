package com.thilaka.design.patterns.behavioural.strategy.mosh.example1.solution;

public class BlackAndWhiteFilter implements Filter{
    @Override
    public void apply(String fileName) {
        System.out.println("Applying Black and White filter");
    }
}
