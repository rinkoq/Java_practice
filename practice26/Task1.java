package practice24_26.practice26;

import java.util.Stack;

public class Task1 {

    /**
     * Инвертирует массив с использованием Stack
     * @param array исходный массив
     * @return инвертированный массив
     */
    public static int[] invertArrayUsingStack(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }

        Stack<Integer> stack = new Stack<>();

        // 1. Помещаем все элементы в стек
        for (int element : array) {
            stack.push(element);
        }

        // 2. Извлекаем из стека - получаем обратный порядок
        int[] inverted = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            inverted[i] = stack.pop();
        }

        return inverted;
    }

    /**
     * Альтернативный метод с использованием Stack для обмена элементов
     */
    public static void invertArrayInPlace(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }

        Stack<Integer> stack = new Stack<>();

        // Помещаем первую половину элементов в стек
        for (int i = 0; i < array.length / 2; i++) {
            stack.push(array[i]);
        }

        // Обмениваем элементы
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    /**
     * Демонстрация работы метода
     */
    public static void demonstrate() {
        System.out.println("=== Упражнение 1: Инверсия массива через Stack ===\n");

        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Исходный массив: " + arrayToString(original));

        int[] inverted = invertArrayUsingStack(original);
        System.out.println("Инвертированный массив: " + arrayToString(inverted));

        // Демонстрация in-place инверсии
        int[] arrayCopy = original.clone();
        invertArrayInPlace(arrayCopy);
        System.out.println("In-place инверсия: " + arrayToString(arrayCopy));
    }

    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}