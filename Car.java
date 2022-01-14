package ru.alexander_kramarenko.refactoring_project;

abstract class Car {

    // Класса Engine не хватает
    public Engine engine;

    // У класса Car есть наследники
    // Но они не смогут увидеть поля Color и Name
    // т.к. они имеют модификатор private

    // Получать доступ через getter плохая идея,
    // т.к. наследник обращается к своему (родительскому) полю
    // через getter и setter

    // Необходимо с private повысить до default,
    // а с public снизить до default
    private String color;
    private String name;

    // Почему не public методы start() и open()
    // Снаружи можно подойти к машине
    // открыть и завести
    // Назначение модификаторов protected и abstract не ясно

    // Методы open(), start(), move() и stop() можно реализовать в родителе

    protected void start() {
        System.out.println("Car starting");
    }

    abstract void open();

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
