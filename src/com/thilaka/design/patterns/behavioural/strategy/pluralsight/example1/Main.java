package com.thilaka.design.patterns.behavioural.strategy.pluralsight.example1;

import java.util.*;

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

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
               if(o1.getAge() > o2.getAge())
                    return 1;
                if(o1.getAge() < o2.getAge())
                    return -1;
                return 0;
            }
        });

        System.out.println("\nSorted by age");
        printContents(people);

        // a better way of writing the same logic
        //Collections.sort(people, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        Collections.sort(people, Comparator.comparing(Person::getName));

        System.out.println("\nSorted by name");
        printContents(people);
    }
}
