package com.thilaka.design.patterns.behavioural.command.pluralsight.example1;

public class Main {

    public static void main(String[] args) {
        var task1 = new  Task(10,12);//encapsulate request
        var task2 = new  Task(11,13);

        Thread thread1 = new Thread(task1);
        thread1.start();//invoker


        Thread thread2 = new Thread(task2);
        thread2.start();

    }


}

class Task implements Runnable{
    private int num1;
    private int num2;

    public Task(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void run() {//execute method
        System.out.println(num1 * num2);//receiver
    }
}
