package com.thilaka.design.patterns.behavioural.strategy.mosh.example1.problem;

public class ImageStorage {
    private String compressor;
    private String filter;

    public ImageStorage(String compressor, String filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileName){
        if (compressor.equalsIgnoreCase("jpeg"))
            System.out.println("Compressing using JPEG");
        else if (compressor.equalsIgnoreCase("png"))
            System.out.println("Compressing using PNG");

        if (filter.equalsIgnoreCase("b&w"))
            System.out.println("Applying B&W filter");
        else if (filter.equalsIgnoreCase("high-contrast"))
            System.out.println("Applying high contrast filter");
    }
}
