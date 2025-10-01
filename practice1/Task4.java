package practice1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Размер массива:");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Массив:");

        int i = 0;
        while (i < size) {
            arr[i] = scanner.nextInt();
            i += 1;
        }

        int sum = 0;
        int j = 0;
        do {
            sum += arr[j];
            j += 1;
        } while (j < size);

        int max = arr[0];
        int min = arr[0];

        for (int k = 1; k < size; k++) {
            if (arr[k] > max) {
                max = arr[k];
            }
            if (arr[k] < min) {
                min = arr[k];
            }
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);

        scanner.close();
    }
}
