package practice22;

public class Stack<T> {
    private Object[] elements;
    private int top;
    private int capacity;

    public Stack(int size) {
        capacity = size;
        elements = new Object[capacity];
        top = -1;
    }

    public void push(T element) {
        if (isFull()) {
            throw new IllegalStateException("Стек переполнен");
        }
        elements[++top] = element;
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Нельзя выполнить POP для пустого стека");
        }
        return (T) elements[top--];
    }

    @SuppressWarnings("unchecked")
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return (T) elements[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public int size() {
        return top + 1;
    }
}