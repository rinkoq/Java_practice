package practice24_26.practice26;
import java.util.Iterator;

public class TestTask2 {
    public static void main(String[] args) {
        // Создаем список
        MyList<String> list = new MyArrayList<>();

        // Тест 1: Добавление элементов
        System.out.println("Тест 1: Добавление элементов");
        list.add("Яблоко");
        list.add("Банан");
        list.add("Апельсин");
        list.add("Груша");
        list.add("Виноград");
        printList("После добавления 5 элементов:", list);

        // Тест 2: Получение элементов
        System.out.println("\nТест 2: Получение элементов по индексу");
        System.out.println("list.get(0) = " + list.get(0));
        System.out.println("list.get(2) = " + list.get(2));
        System.out.println("list.get(4) = " + list.get(4));

        // Тест 3: Изменение элементов
        System.out.println("\nТест 3: Изменение элементов");
        list.set(1, "КИВИ");  // Меняем "Банан" на "КИВИ"
        System.out.println("После set(1, 'КИВИ'):");
        printList("Список:", list);

        // Тест 4: Итератор
        System.out.println("\nТест 4: Работа итератора");
        System.out.println("Итерация через while:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("  - " + iterator.next());
        }

        // Тест 5: For-each (требует Iterable)
        System.out.println("\nТест 5: For-each цикл");
        for (String fruit : list) {
            System.out.println("  - " + fruit);
        }

        // Тест 6: Удаление через итератор
        System.out.println("\nТест 6: Удаление через итератор");
        Iterator<String> iter2 = list.iterator();
        while (iter2.hasNext()) {
            String fruit = iter2.next();
            if (fruit.contains("и")) {  // Удаляем элементы с буквой 'и'
                iter2.remove();
                System.out.println("Удален: " + fruit);
            }
        }
        printList("После удаления элементов с 'и':", list);

        // Тест 7: Удаление по индексу
        System.out.println("\nТест 7: Удаление по индексу");
        list.remove(0);  // Удаляем первый элемент
        printList("После remove(0):", list);

        // Тест 8: Проверка размера и пустоты
        System.out.println("\nТест 8: Размер и пустота");
        System.out.println("Размер списка: " + list.size());
        System.out.println("Список пуст? " + list.isEmpty());

        // Тест 9: Очистка списка
        System.out.println("\nТест 9: Очистка списка");
        list.clear();
        System.out.println("После clear():");
        System.out.println("Размер: " + list.size());
        System.out.println("Пуст? " + list.isEmpty());
    }

    private static void printList(String label, MyList<?> list) {
        System.out.print(label + " [");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
