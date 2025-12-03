package practice24_26.practice26;

import java.util.Iterator;

public class Task3 {

    public static void demonstrate() {
        System.out.println("\n=== Упражнение 3: Iterator для собственного LinkedList ===\n");

        // Создаем связный список
        MyList<Integer> linkedList = new MyLinkedList<>();

        // Добавляем элементы
        for (int i = 1; i <= 10; i++) {
            linkedList.add(i * 10);
        }

        System.out.println("Содержимое связного списка:");
        for (Integer num : linkedList) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // Используем итератор с удалением
        System.out.println("Удаляем элементы > 50 с помощью итератора:");
        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            System.out.print(num + " ");
            if (num > 50) {
                iterator.remove();
                System.out.print("(удален) ");
            }
        }

        System.out.println("\n\nСписок после удаления:");
        for (Integer num : linkedList) {
            System.out.print(num + " ");
        }
        System.out.println("\n\nРазмер списка: " + linkedList.size());
    }
}