package ru.alexander_kramarenko.refactoring.no_interface;

// Реализация управления разным транспортом БЕЗ использования интерфейсов
// Класс Human существенно усложнился и
// при добавлении каждого нового транспортного средства
// требует создания нескольких методов для него

public class TransportManager {

    public static void main(String[] args) {
        Car car = new Car("BMW", 60);
        Bicycle bicycle = new Bicycle("Star", 29);
        Moto moto = new Moto("Suzuki", 200);
        Human human = new Human("Bob");


        human.startCar(car);
        human.stopCar();

        human.rideBicycle(bicycle);
        human.stopBicycle();

        human.rideMoto(moto);
        human.stopMoto();


    }


}
