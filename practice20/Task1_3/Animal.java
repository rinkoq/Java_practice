package practice18_20.practice20.Task1_3;

import java.io.Serializable;

// Базовый класс Animal для ограничения V
class Animal implements Serializable {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{name='" + name + "'}";
    }
}
