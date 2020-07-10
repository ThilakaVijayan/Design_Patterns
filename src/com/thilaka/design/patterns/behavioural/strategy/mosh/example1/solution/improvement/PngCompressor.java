package com.thilaka.design.patterns.behavioural.strategy.mosh.example1.solution.improvement;

public class PngCompressor implements Compressor {
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing using PNG");
    }
}
