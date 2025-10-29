package practice9;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.getGpa(), s1.getGpa());
    }

    //Выбираем "опорный" элемент (pivot)
    //Перемещаем все элементы меньше pivot влево, больше - вправо
    //Рекурсивно сортируем левую и правую части

    public void quickSort(Student[] students, int low, int high) {
        if (low < high) {
            int pi = partition(students, low, high); // Разделяем массив
            quickSort(students, low, pi - 1); // Сортируем левую часть
            quickSort(students, pi + 1, high); // Сортируем правую часть
        }
    }

    //pivot = students[high] - опорный элемент (последний в текущем диапазоне)
    //i - указывает на границу между "меньшими" и "большими" элементами
    //Цикл for проходит по всем элементам и перемещает те, которые должны быть слева от pivot
    //В конце pivot ставится на правильную позицию

    private int partition(Student[] students, int low, int high) {
        Student pivot = students[high]; // Берем последний элемент как опорный
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (compare(students[j], pivot) < 0) {
                i++;
                swap(students, i, j);
            }
        }

        swap(students, i + 1, high);
        return i + 1;
    }

    private void swap(Student[] students, int i, int j) {
        Student temp = students[i];
        students[i] = students[j];
        students[j] = temp;
    }

    public void quickSort(Student[] students) {
        quickSort(students, 0, students.length - 1);
    }
}

