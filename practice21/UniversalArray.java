package practice21;

import java.util.Arrays;

public class UniversalArray<T> {
    private T[] array;

    public UniversalArray(T[] array) {
        this.array = array;
    }

    public T getElement(int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Индекс: " + index + ", Размер: " + array.length);
        }
        return array[index];
    }

    public T[] getArray() {
        return array;
    }

    public int getSize() {
        return array.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    public static void main(String[] args) {
        // Тест с целыми числами
        Integer[] intArray = {10, 20, 30, 40, 50};
        UniversalArray<Integer> intStorage = new UniversalArray<>(intArray);
        System.out.println("Целочисленный массив: " + intStorage);
        System.out.println("Элемент с индексом 2: " + intStorage.getElement(2));

        // Тест со строками
        String[] strArray = {"apple", "banana", "cherry"};
        UniversalArray<String> strStorage = new UniversalArray<>(strArray);
        System.out.println("Строковый массив: " + strStorage);
        System.out.println("Элемент с индексом 1: " + strStorage.getElement(1));
    }
}