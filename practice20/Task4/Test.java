package practice18_20.practice20.Task4;

public class Test {
    public static void main(String[] args) {
        System.out.println("MinMax");
        // Тест с числами
        Integer[] numbers = {5, 2, 8, 1, 9, 3};
        MinMax<Integer> numberMinMax = new MinMax<>(numbers);
        System.out.println("Массив: " + java.util.Arrays.toString(numbers));
        System.out.println("Минимум: " + numberMinMax.findMin());
        System.out.println("Максимум: " + numberMinMax.findMax());

        // Тест со строками
        String[] words = {"яблоко", "банан", "вишня"};
        MinMax<String> stringMinMax = new MinMax<>(words);
        System.out.println("Массив: " + java.util.Arrays.toString(words));
        System.out.println("Минимум: " + stringMinMax.findMin());
        System.out.println("Максимум: " + stringMinMax.findMax());

        System.out.println("Calculator:");

        // Тест калькулятора
        System.out.println("10 + 3.5 = " + Calculator.sum(10, 3.5));
        System.out.println("7 * 2 = " + Calculator.multiply(7, 2));
        System.out.println("15 - 4.2 = " + Calculator.subtraction(15, 4.2));
        System.out.println("20 / 3 = " + Calculator.divide(20, 3));
        System.out.println("5.5f + 10L = " + Calculator.sum(5.5f, 10L));
    }
}