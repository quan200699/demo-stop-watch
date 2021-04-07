package com.codegym;

public class StopWatch {
    private double startTime;
    private double endTime;

    StopWatch() {
    }

    void start() {
        this.startTime = System.currentTimeMillis(); //Lấy ra thời gian hiện tại của hệ thống theo milis giây
    }

    void stop() {
        this.endTime = System.currentTimeMillis();
    }

    double getElapsedTime() {
        return this.endTime - this.startTime;
    }
}
