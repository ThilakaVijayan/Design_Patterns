package com.thilaka.design.patterns.behavioural.template.mosh.example1;

public class Main {
    public static void main(String[] args) {
        var task = new TransferMoneyTask();
        task.execute();

        var task2 = new GenerateReportTask();
        task2.execute();

    }
}
