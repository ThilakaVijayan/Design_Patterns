package com.thilaka.design.patterns.behavioural.strategy.mosh.example1.solution;

public class ImageStorage {
    private Compressor compressor;
    private Filter filter;

    public ImageStorage(Compressor compressor, Filter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileName){
        compressor.compress(fileName);
        filter.apply(fileName);
    }
}
