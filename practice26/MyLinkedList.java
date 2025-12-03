package practice24_26.practice26;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Узел для связного списка
 */
class Node<T> {
    T data;
    Node<T> next;
    Node<T> prev;

    Node(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

/**
 * Собственный связный список
 */
public class MyLinkedList<T> implements MyList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        return getNode(index).data;
    }

    @Override
    public void set(int index, T element) {
        checkIndex(index);
        getNode(index).data = element;
    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        Node<T> toRemove = getNode(index);

        if (toRemove.prev != null) {
            toRemove.prev.next = toRemove.next;
        } else {
            head = toRemove.next;
        }

        if (toRemove.next != null) {
            toRemove.next.prev = toRemove.prev;
        } else {
            tail = toRemove.prev;
        }

        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        head = tail = null;
        size = 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    /**
     * Итератор для связного списка
     */
    private class LinkedListIterator implements Iterator<T> {
        private Node<T> current = head;
        private Node<T> lastReturned = null;
        private int nextIndex = 0;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            lastReturned = current;
            T data = current.data;
            current = current.next;
            nextIndex++;
            return data;
        }

        @Override
        public void remove() {
            if (lastReturned == null) {
                throw new IllegalStateException();
            }

            Node<T> next = lastReturned.next;

            if (lastReturned.prev != null) {
                lastReturned.prev.next = next;
            } else {
                head = next;
            }

            if (next != null) {
                next.prev = lastReturned.prev;
            } else {
                tail = lastReturned.prev;
            }

            lastReturned = null;
            size--;
            nextIndex--;
        }
    }

    private Node<T> getNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        Node<T> current;
        if (index < size / 2) {
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
        }
        return current;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }
}