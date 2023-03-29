package org.example;

public class MyArrayList<T> {
    private Object[] elements;
    private int listSize;

    public MyArrayList() {
        elements = new Object[10];
    }
    public void add(T value) {
        if(listSize == elements.length) {
            int newSize = elements.length + Math.round(1.5f * elements.length);
            Object[] newElements = new Object[newSize];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
        elements[listSize] = value;
        listSize++;
    }
    public int size() {
        return listSize;
    }

    public T get(int index) {
        return (T) elements[index];
    }


    public void clear() {
        elements = new Object[0];
        listSize = 0;
    }



    public void remove(int index) {
        Object[] buffer;
        buffer = elements;
        elements = new Object[buffer.length - 1];
        for(int i = 0, j = 0; i < buffer.length; i++) {
            if(i != index) {
                elements[j] = buffer[i];
                j++;
            }
        }
        listSize--;
    }
}
