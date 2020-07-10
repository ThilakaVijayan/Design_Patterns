package com.thilaka.design.patterns.behavioural.strategy.mosh.example1.solution.improvement;

public class ImageStorage {

    public void store(String fileName,Compressor compressor, Filter filter){
        compressor.compress(fileName);
        filter.apply(fileName);
    }
}
