package ru.alexander_kramarenko.refactoring.interface_based;

public class Human {
    private String name;
    private Transport currentTransport;

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public Human(String name) {
        this.name = name;
    }


    public void ride(Transport transport) {
        if (!transport.isOnTheWay()) {
            transport.move();
            currentTransport = transport;
            System.out.println(name + " поехал " + transport.getModel());
        }
    }

    public void stop() {
        if (currentTransport != null) {
            currentTransport.stop();
            System.out.println(name + " остановил  " + currentTransport.getModel());
            currentTransport = null;
        }
    }

//############################################################


}
