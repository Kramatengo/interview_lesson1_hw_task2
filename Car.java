package ru.alexander_kramarenko.refactoring.interface_based;

public class Car implements Transport {
    private String model;
    private int speed;
    private boolean onTheWay;


    @Override
    public String getModel() {
        return model;
    }

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public void move() {
        onTheWay = true;
    }

    @Override
    public void stop() {
        onTheWay = false;
    }

    @Override
    public boolean isOnTheWay() {
        return onTheWay;
    }


}
