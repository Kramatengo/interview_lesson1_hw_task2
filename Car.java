package ru.alexander_kramarenko.refactoring.no_interface;

public class Car {
    private String model;
    private int speed;
    private boolean onTheWay;

    public String getModel() {
        return model;
    }

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public void move() {
        onTheWay = true;
    }

    public void stop() {
        onTheWay = false;
    }

    public boolean isOnTheWay() {
        return onTheWay;
    }


}
