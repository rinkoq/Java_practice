package practice10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();

        Student[] students1 = {
                new Student("Иван", "Петров", "Информатика", 2, "ИС-21", 4.5),
                new Student("Мария", "Сидорова", "Математика", 1, "МТ-11", 4.8),
                new Student("Алексей", "Иванов", "Физика", 3, "ФЗ-31", 4.2)
        };

        sorter.setArray(students1);

        System.out.println("Исходный список:");
        sorter.outArray();

        System.out.println("\nСортировка по среднему баллу (быстрая сортировка):");
        sorter.quicksort();
        sorter.outArray();

        System.out.println("\nСортировка по фамилии:");
        sorter.sortBySurname();
        sorter.outArray();

        List<Student> list1 = Arrays.asList(
                new Student("Ольга", "Кузнецова", "Химия", 2, "ХМ-22", 4.7),
                new Student("Дмитрий", "Смирнов", "Биология", 1, "БЛ-12", 4.1)
        );

        List<Student> list2 = Arrays.asList(
                new Student("Екатерина", "Васильева", "Информатика", 3, "ИС-31", 4.9),
                new Student("Борис", "Орлов", "Физика", 2, "ФЗ-22", 4.3)
        );

        List<Student> mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);

        SortingStudentsByGPA mergedSorter = new SortingStudentsByGPA();
        mergedSorter.setArray(mergedList);

        System.out.println("\nОбъединенный список после сортировки слиянием:");
        mergedSorter.mergeSort();
        mergedSorter.outArray();
    }
}