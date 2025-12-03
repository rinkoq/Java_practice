package practice24_26.practice26;

/**
 * Собственный интерфейс List
 */
interface MyList<T> extends Iterable<T> {
    void add(T element);

    T get(int index);

    void set(int index, T element);

    void remove(int index);

    int size();

    boolean isEmpty();

    void clear();
}
