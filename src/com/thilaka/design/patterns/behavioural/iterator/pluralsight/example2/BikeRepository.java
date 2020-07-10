package com.thilaka.design.patterns.behavioural.iterator.pluralsight.example2;

import java.util.Iterator;

public class BikeRepository implements Iterable<String>{

    private String[] bikes;
    private int index;

    public BikeRepository(){
        bikes = new String[10];
        index = 0;
    }

    public void addBike(String bike){
        if(index == bikes.length){
            String[] largerBikes = new String[bikes.length + 5];
            System.arraycopy(bikes, 0, largerBikes, 0, bikes.length);
            bikes = largerBikes;
        }

        bikes[index++] = bike;
    }


    @Override
    public Iterator<String> iterator() {
        return new Iterator<>() {

            private int currentIndex;

            @Override
            public boolean hasNext() {
                return currentIndex < bikes.length && bikes[currentIndex] != null;
            }

            @Override
            public String next() {
                return bikes[currentIndex++];
            }
        };
    }
}
