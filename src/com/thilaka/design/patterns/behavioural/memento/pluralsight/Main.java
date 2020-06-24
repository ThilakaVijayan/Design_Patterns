package com.thilaka.design.patterns.behavioural.memento.pluralsight;

public class Main {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Employee emp = new Employee();
        emp.setName("Mia");
        emp.setAddress("Russell Street");
        emp.setPhone("0440-123-209");

        System.out.println("Employee before save             :" + emp);

        caretaker.save(emp);

        emp.setPhone("0111-111-111");

        caretaker.save(emp);

        System.out.println("Employee after phone number save :" + emp);

        emp.setPhone("0222-222-222"); //we haven't called save

        caretaker.revert(emp);

        System.out.println("Reverts to last save point       :" + emp);

        caretaker.revert(emp);

        System.out.println("Reverted to original:             " + emp);

    }
}
