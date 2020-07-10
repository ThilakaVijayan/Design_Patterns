package com.thilaka.design.patterns.behavioural.strategy.mosh.example1.solution.improvement;

public class Main {
    public static void main(String[] args) {
        var imageStorage = new ImageStorage();
        imageStorage.store("a",new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("a",new PngCompressor(), new BlackAndWhiteFilter());
    }
}
