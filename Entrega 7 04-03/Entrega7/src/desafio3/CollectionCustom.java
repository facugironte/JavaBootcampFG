package desafio3;

import java.util.Arrays;

public class CollectionCustom<T> {
    private T[] array;
    private int size;


    public CollectionCustom() {
        array = (T[]) new Object[1];
        size = 0;
    }

    public int size() {
        return size;
    }

    public void addFirst(T element) {
        chequearCapacidad();
        moverD();
        array[0] = element;
        size++;
    }

    public void addLast(T element) {
        chequearCapacidad();
        array[size] = element;
        size++;
    }

    public void add(T element) {
        addLast(element);
    }

    public T remove(T element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                T removed = array[i];
                moverI(i);
                size--;
                return removed;
            }
        }
        return null; // Element not found
    }

    public void removeAll() {
        size = 0;
    }

    public boolean empty() {
        return size == 0;
    }

    private void chequearCapacidad() {
        if (size == array.length) {
            int newCapacity = array.length + 1;
            array = Arrays.copyOf(array, newCapacity);
        }
    }

    private void moverD() {
        System.arraycopy(array, 0, array, 1, size);
    }

    private void moverI(int index) {
        if (index >= 0 && index < size) {
            System.arraycopy(array, index + 1, array, index, size - index - 1);
        }
    }
}