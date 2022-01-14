package ru.alexander_kramarenko.refactoring.interface_based;

public class Moto implements Transport {

    private String model;
    private int speed;
    private boolean busy;


    @Override
    public String getModel() {
        return model;
    }

    public Moto(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public void move() {
        busy = true;
    }

    @Override
    public void stop() {
        busy = false;
    }

    @Override
    public boolean isOnTheWay() {
        return busy;
    }


}
