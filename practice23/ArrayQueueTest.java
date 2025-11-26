package practice23;

public class ArrayQueueTest {
    public static void main(String[] args) {
        System.out.println("Тестирование ArrayQueue");

        ArrayQueue queue = new ArrayQueue(3);

        //Добавление элементов
        System.out.println("Добавление элементов");
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        System.out.println(queue);
        System.out.println("Размер: " + queue.size());
        System.out.println();

        //Просмотр первого элемента
        System.out.println("Просмотр элемента");
        System.out.println("Первый элемент: " + queue.element());
        System.out.println();

        //Удаление элементов
        System.out.println("Удаление элементов");
        System.out.println("Удален: " + queue.dequeue());
        System.out.println("Удален: " + queue.dequeue());
        System.out.println(queue);
        System.out.println();

        //Добавление после удаления (циклическая очередь)
        System.out.println("Циклическая очередь");
        queue.enqueue("D");
        queue.enqueue("E");
        System.out.println(queue);
        System.out.println();

        //Пустая очередь
        System.out.println("Пустая очередь");
        queue.clear();
        System.out.println("Очередь пуста: " + queue.isEmpty());
        System.out.println("Размер: " + queue.size());
        System.out.println();

        //Обработка ошибок
        System.out.println("Обработка ошибок");
        try {
            queue.dequeue();
        } catch (IllegalStateException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }

        try {
            for (int i = 0; i < 4; i++) {
                queue.enqueue(i);
            }
        } catch (IllegalStateException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }
    }
}