package practice18_20.practice20.Task1_3;

public class Triple<T extends Comparable<T>, V extends Animal, K> {
    private T first;
    private V second;
    private K third;

    // Конструктор
    public Triple(T first, V second, K third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    // Геттеры
    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public K getThird() {
        return third;
    }

    // Метод для вывода имен классов переменных
    public void printClassNames() {
        System.out.println("Тип T: " + first.getClass().getSimpleName());
        System.out.println("Тип V: " + second.getClass().getSimpleName());
        System.out.println("Тип K: " + third.getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return "Triple{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }
}