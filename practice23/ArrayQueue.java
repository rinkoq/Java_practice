package practice23;

/**
 * Инварианты очереди:
 * - 0 <= size <= capacity
 * - 0 <= front < capacity
 * - 0 <= rear < capacity
 * - Если очередь не пуста, то element() возвращает первый добавленный элемент
 * - size увеличивается на 1 при enqueue и уменьшается на 1 при dequeue
 * - Очередь работает по принципу FIFO (First-In-First-Out)
 */
public class ArrayQueue {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int front;
    private int rear;
    private int size;

    /**
     * Предусловие: capacity > 0
     * Постусловие: создана пустая очередь с заданной емкостью
     */
    public ArrayQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Емкость должна быть положительной");
        }
        this.elements = new Object[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public ArrayQueue() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * Предусловие: очередь не заполнена (size < capacity)
     * Постусловие: элемент добавлен в конец очереди, size увеличен на 1
     */
    public void enqueue(Object element) {
        if (isFull()) {
            throw new IllegalStateException("Очередь переполнена");
        }
        rear = (rear + 1) % elements.length;
        elements[rear] = element;
        size++;
    }

    /**
     * Предусловие: очередь не пуста (size > 0)
     * Постусловие: возвращает первый элемент очереди без удаления
     */
    public Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        return elements[front];
    }

    /**
     * Предусловие: очередь не пуста (size > 0)
     * Постусловие: первый элемент удален из очереди, size уменьшен на 1
     */
    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        Object element = elements[front];
        elements[front] = null;
        front = (front + 1) % elements.length;
        size--;
        return element;
    }

    /**
     * Постусловие: возвращает текущий размер очереди
     */
    public int size() {
        return size;
    }

    /**
     * Постусловие: возвращает true если очередь пуста, иначе false
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Постусловие: удалены все элементы из очереди, size = 0
     */
    public void clear() {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
        front = 0;
        rear = -1;
        size = 0;
    }

    /**
     * Постусловие: возвращает true если очередь заполнена, иначе false
     */
    public boolean isFull() {
        return size == elements.length;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "Queue: []";
        }

        StringBuilder sb = new StringBuilder("Queue: [");
        int current = front;
        for (int i = 0; i < size; i++) {
            sb.append(elements[current]);
            if (i < size - 1) {
                sb.append(", ");
            }
            current = (current + 1) % elements.length;
        }
        sb.append("]");
        return sb.toString();
    }
}