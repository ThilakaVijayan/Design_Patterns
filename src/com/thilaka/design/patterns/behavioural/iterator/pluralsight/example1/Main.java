package com.thilaka.design.patterns.behavioural.iterator.pluralsight.example1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Bryan");
        names.add("Aaron");
        names.add("Jason");


        Iterator<String> namesItr = names.iterator();

        while(namesItr.hasNext()){
            String name = namesItr.next();
            System.out.println(name);
            namesItr.remove();
        }
        System.out.println("Name size: " + names.size());
    }
}
