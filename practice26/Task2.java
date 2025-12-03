package practice24_26.practice26;
import java.util.Iterator;

public class Task2 {

    public static void demonstrate() {
        System.out.println("\n=== Упражнение 2: Собственный List и Iterator ===\n");

        // Создаем собственный список (используем MyArrayList)
        MyList<String> myList = new MyArrayList<>();

        // Добавляем элементы
        myList.add("Первый");
        myList.add("Второй");
        myList.add("Третий");
        myList.add("Четвертый");
        myList.add("Пятый");

        System.out.println("Содержимое списка через итератор:");

        // Используем итератор для обхода
        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("  - " + element);

            // Удаляем элемент, содержащий "Третий"
            if (element.equals("Третий")) {
                iterator.remove();
                System.out.println("    (удален)");
            }
        }

        System.out.println("\nИспользование for-each (требует Iterable):");
        for (String element : myList) {
            System.out.println("  - " + element);
        }

        System.out.println("\nРазмер списка после удаления: " + myList.size());
        System.out.println("Элемент с индексом 2: " + myList.get(2));

        // Дополнительная демонстрация методов List
        System.out.println("\n--- Дополнительные операции ---");
        myList.set(1, "Измененный Второй");
        System.out.println("После set(1): " + myList.get(1));

        myList.remove(0);
        System.out.println("После remove(0), размер: " + myList.size());

        System.out.println("Оставшиеся элементы:");
        for (String element : myList) {
            System.out.println("  - " + element);
        }
    }
}