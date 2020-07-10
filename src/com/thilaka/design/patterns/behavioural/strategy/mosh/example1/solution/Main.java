package com.thilaka.design.patterns.behavioural.strategy.mosh.example1.solution;

public class Main {
    public static void main(String[] args) {
        var imageStorage = new ImageStorage(
                new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("a");
    }
}
