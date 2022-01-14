package ru.alexander_kramarenko.refactoring_project;

// Не хватает ключевого слова implements

// В целом наследники Lorry и LightWeightCar выполняют почти
// такие же функции как и Car
// У Lorry и LightWeightCar нет специальных свойств

class Lorry extends Car, Moveable, Stopable {
    public void move() {
        System.out.println("Car is moving");
    }

    public void stop() {
        System.out.println("Car is stop");
    }
}