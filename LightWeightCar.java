package ru.alexander_kramarenko.refactoring_project;


// Если мы говорим, что
// методы open(), start(), move() и stop() реализованы в классе Car
// можно унаследоваться от Car без дополнительных интерфейсов

// Если говорить о данном дополнительном интерфейсе Movable как он есть,
// то машина не умеет останавливаться

class LightWeightCar extends Car implements Moveable {
    @Override
        // Почему метод все еще закрытый, а не public
    void open() {
        System.out.println("Car is open");
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}