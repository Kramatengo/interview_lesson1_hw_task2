package ru.alexander_kramarenko.refactoring.no_interface;

public class Bicycle {
    private String model;
    private int speed;
    private boolean busy;

    public String getModel() {
        return model;
    }

    public Bicycle(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public void ride() {
        busy = true;
    }

    public void stop() {
        busy = false;
    }

    public boolean isBusy() {
        return busy;
    }

}
