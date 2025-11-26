package practice23;

/**
 * Интерфейс очереди
 * Контракт:
 * - enqueue добавляет элемент в конец очереди
 * - element возвращает первый элемент без удаления
 * - dequeue удаляет и возвращает первый элемент
 * - size возвращает количество элементов
 * - isEmpty проверяет пустоту очереди
 * - clear удаляет все элементы
 */
interface Queue {
    void enqueue(Object element);
    Object element();
    Object dequeue();
    int size();
    boolean isEmpty();
    void clear();
}

/**
 * Абстрактный базовый класс для очередей
 */
abstract class AbstractQueue implements Queue {
    protected int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public abstract void clear();
}

/**
 * Узел связного списка
 */
class Node {
    Object data;
    Node next;

    Node(Object data) {
        this.data = data;
        this.next = null;
    }
}

/**
 * Очередь на связном списке
 */
public class LinkedQueue extends AbstractQueue {
    private Node front;
    private Node rear;

    public LinkedQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    @Override
    public void enqueue(Object element) {
        Node newNode = new Node(element);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    @Override
    public Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        return front.data;
    }

    @Override
    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        Object element = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return element;
    }

    @Override
    public void clear() {
        front = null;
        rear = null;
        size = 0;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "LinkedQueue: []";
        }

        StringBuilder sb = new StringBuilder("LinkedQueue: [");
        Node current = front;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
}