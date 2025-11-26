package practice23;

public class LinkedQueueTest {
    public static void main(String[] args) {
        System.out.println("Тестирование LinkedQueue");

        LinkedQueue queue = new LinkedQueue();

        //Добавление элементов
        System.out.println("Добавление элементов");
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
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

        //Добавление после удаления
        System.out.println("Добавление после удаления");
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println(queue);
        System.out.println();

        //Очистка очереди
        System.out.println("Очистка очереди");
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
    }
}