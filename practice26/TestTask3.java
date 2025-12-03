package practice24_26.practice26;
import java.util.Iterator;

public class TestTask3 {
    public static void main(String[] args) {
        // Создаем связный список
        MyList<Integer> list = new MyLinkedList<>();

        // Тест 1: Добавление элементов
        System.out.println("Тест 1: Добавление элементов (1-10)");
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        printList("После добавления:", list);

        // Тест 2: Получение элементов
        System.out.println("\nТест 2: Получение элементов");
        System.out.println("Первый элемент: " + list.get(0));
        System.out.println("Последний элемент: " + list.get(list.size() - 1));
        System.out.println("Средний элемент: " + list.get(list.size() / 2));

        // Тест 3: Изменение элементов
        System.out.println("\nТест 3: Изменение элементов");
        list.set(0, 100);  // Первый -> 100
        list.set(5, 555);  // Шестой -> 555
        list.set(9, 999);  // Последний -> 999
        printList("После set():", list);

        // Тест 4: Итератор с удалением
        System.out.println("\nТест 4: Итератор с удалением четных чисел");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 2 == 0) {
                iterator.remove();
                System.out.println("Удалено: " + num);
            }
        }
        printList("После удаления четных:", list);

        // Тест 5: Удаление по индексу
        System.out.println("\nТест 5: Удаление по индексу");
        System.out.println("Удаляем первый элемент: " + list.get(0));
        list.remove(0);
        System.out.println("Удаляем последний элемент: " + list.get(list.size() - 1));
        list.remove(list.size() - 1);
        printList("После удаления:", list);

        // Тест 6: Добавление после удаления
        System.out.println("\nТест 6: Добавление новых элементов");
        list.add(777);
        list.add(888);
        list.add(999);
        printList("После добавления 777, 888, 999:", list);

        // Тест 7: Полный перебор
        System.out.println("\nТест 7: Полный перебор через for-each");
        int sum = 0;
        for (Integer num : list) {
            System.out.print(num + " ");
            sum += num;
        }
        System.out.println("\nСумма всех элементов: " + sum);

        // Тест 8: Очистка
        System.out.println("\nТест 8: Очистка списка");
        list.clear();
        System.out.println("Размер после clear(): " + list.size());
        System.out.println("Список пуст? " + list.isEmpty());

        // Тест 9: Добавление в пустой список
        System.out.println("\nТест 9: Добавление в очищенный список");
        list.add(42);
        list.add(43);
        list.add(44);
        printList("Новые элементы:", list);
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
