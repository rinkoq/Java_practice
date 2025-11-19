package practice21;

import java.util.*;

public class ArrayConverter {

    public static <T> List<T> convertArrayToList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T element : array) {
            list.add(element);
        }
        return list;
    }

    public static void main(String[] args) {
        // Тест со строками
        String[] stringArray = {"один", "два", "три"};
        List<String> stringList = convertArrayToList(stringArray);
        System.out.println("Массив строк: " + Arrays.toString(stringArray));
        System.out.println("Список строк: " + stringList);

        // Тест с числами
        Integer[] numberArray = {1, 2, 3, 4, 5};
        List<Integer> numberList = convertArrayToList(numberArray);
        System.out.println("Массив чисел: " + Arrays.toString(numberArray));
        System.out.println("Список чисел: " + numberList);
    }
}
