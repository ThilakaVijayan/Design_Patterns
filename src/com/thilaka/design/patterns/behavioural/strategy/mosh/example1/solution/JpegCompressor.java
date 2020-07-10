package com.thilaka.design.patterns.behavioural.strategy.mosh.example1.solution;

public class JpegCompressor implements Compressor{
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing using JPEG");
    }
}
