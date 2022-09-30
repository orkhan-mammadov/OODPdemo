package org.example.service.strategy;

public class Rate {
    private int lowRate = 70;
    private int midRate = 50;
    private int highRate = 30;
    private static final Rate instance = new Rate();

    private Rate(){}

    public static Rate getInstance(){
        return instance;
    }

    public int getLowRate() {
        return lowRate;
    }

    public void setLowRate(int lowRate) {
        this.lowRate = lowRate;
    }

    public int getMidRate() {
        return midRate;
    }

    public void setMidRate(int midRate) {
        this.midRate = midRate;
    }

    public int getHighRate() {
        return highRate;
    }

    public void setHighRate(int highRate) {
        this.highRate = highRate;
    }
}
