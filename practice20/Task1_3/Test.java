package practice18_20.practice20.Task1_3;

public class Test {
    public static void main(String[] args) {
        // Тест 1
        Triple<String, Dog, Integer> test1 = new Triple<>("Привет", new Dog("Шарик"), 100);
        test1.printClassNames();
        System.out.println("Значения: " + test1.getFirst() + ", " + test1.getSecond().getName() + ", " + test1.getThird());

        // Тест 2
        Triple<Integer, Dog, Double> test2 = new Triple<>(50, new Dog("Бобик"), 3.14);
        test2.printClassNames();
    }
}