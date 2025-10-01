package practice3;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Размер массива: ");
        int size = scanner.nextInt();

        executeWithMathRandom(size);
        executeWithRandomClass(size);

        scanner.close();
    }

    public static void executeWithMathRandom(int size) {
        double[] array = new double[size];

        System.out.println("Math.random():");

        // Заполнение массива
        for (int i = 0; i < size; i++) {
            array[i] = Math.random() * 100;
        }

        displayArray("Исходный массив:", array);
        Arrays.sort(array); // Сортировка
        displayArray("Отсортированный массив:", array);
    }

    public static void executeWithRandomClass(int size) {
        Random random = new Random();
        double[] array = new double[size];
        System.out.println("Random:");

        // Заполнение массива
        for (int i = 0; i < size; i++) {
            array[i] = random.nextDouble() * 100 - 50;
        }

        displayArray("Исходный массив:", array);
        Arrays.sort(array);
        displayArray("Отсортированный массив:", array);

    }

    // Метод для красивого вывода массива
    public static void displayArray(String message, double[] array) {
        System.out.println(message);
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%8.2f", array[i]);
        }
        System.out.println();
    }
}
