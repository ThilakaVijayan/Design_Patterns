package com.thilaka.design.patterns.behavioural.observer.mosh.example1.pullstyle;

public class SpreadSheet implements Observer {
    private DataSource dataSource;

    public SpreadSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("SpreadSheet got notified: " + dataSource.getValue());
    }
}
