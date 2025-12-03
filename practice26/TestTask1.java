package practice24_26.practice26;

public class TestTask1 {
    public static void main(String[] args) {
        // Тест 1: Инверсия обычного массива
        System.out.println("Тест 1: Инверсия массива [1, 2, 3, 4, 5]");
        int[] test1 = {1, 2, 3, 4, 5};
        int[] result1 = Task1.invertArrayUsingStack(test1);
        printArray("Исходный:", test1);
        printArray("Результат:", result1);

        // Тест 2: Инверсия пустого массива
        System.out.println("\nТест 2: Инверсия пустого массива");
        int[] test2 = {};
        int[] result2 = Task1.invertArrayUsingStack(test2);
        printArray("Исходный:", test2);
        printArray("Результат:", result2);

        // Тест 3: Инверсия массива с одним элементом
        System.out.println("\nТест 3: Инверсия массива [42]");
        int[] test3 = {42};
        int[] result3 = Task1.invertArrayUsingStack(test3);
        printArray("Исходный:", test3);
        printArray("Результат:", result3);

        // Тест 4: In-place инверсия
        System.out.println("\nТест 4: In-place инверсия [10, 20, 30, 40, 50]");
        int[] test4 = {10, 20, 30, 40, 50};
        System.out.print("До: ");
        for (int num : test4) System.out.print(num + " ");
        Task1.invertArrayInPlace(test4);
        System.out.print("\nПосле: ");
        for (int num : test4) System.out.print(num + " ");

        // Тест 5: Большой массив
        System.out.println("\n\nТест 5: Инверсия массива из 10 элементов");
        int[] test5 = new int[10];
        for (int i = 0; i < 10; i++) test5[i] = i * 2;
        int[] result5 = Task1.invertArrayUsingStack(test5);
        printArray("Исходный:", test5);
        printArray("Результат:", result5);
    }

    private static void printArray(String label, int[] array) {
        System.out.print(label + " [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
