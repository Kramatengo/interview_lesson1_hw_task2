package ru.alexander_kramarenko.refactoring.interface_based;

// Реализация управления разным транспортом на основе интерфейсов
// Интерфейс позволяет существенно упростить класс Human
// избегая многочисленного повторения методов для каждого из
// транспортных средств.

public class TransportManager {

    public static void main(String[] args) {

        Human human = new Human("Bob");
        Car car = new Car("BMW", 100);
        Moto moto = new Moto("SUZUKI", 200);
        Bicycle bicycle = new Bicycle("Star", 20);

        human.ride(car);
        human.stop();

        human.ride(moto);
        human.stop();

        human.ride(bicycle);
        human.stop();
    }
}
