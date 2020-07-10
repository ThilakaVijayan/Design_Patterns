package com.thilaka.design.patterns.behavioural.template.pluralsight.example1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    private static void printContents(List<Person> people){
        for (Person person: people) {
            System.out.println(person.getName());
        }
    }

    public static void main(String[] args) {
        var bryan = new Person("Bryan", "0441-123-984",39);
        var mark = new Person("Mark", "0541-123-984",41);
        var chris = new Person("Chris", "0341-123-984",38);

        List<Person> people = new ArrayList<>();
        people.add(bryan);
        people.add(mark);
        people.add(chris);

        System.out.println("Not Sorted");
        printContents(people);

        Collections.sort(people);

        System.out.println("\nSorted by age");
        printContents(people);
    }
}
