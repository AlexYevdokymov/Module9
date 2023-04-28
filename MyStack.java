package org.example;

public class MyStack<T> {
    private Object[] objects = new Object[0];

    public void push(T value) {
        Object[] buff = objects;
        objects = new Object[objects.length + 1];
        System.arraycopy(buff, 0, objects, 0, objects.length - 1);
        objects[objects.length-1] = value;
    }

    public int size() {
        if(objects == null) return 0;
        return objects.length;
    }
    public void clear() {
        objects = null;
    }
    public void remove(int index) {
        Object[] buffer;
        buffer = objects;
        objects = new Object[buffer.length - 1];
        for(int i = 0, j = 0; i < buffer.length; i++) {
            if(i != index) {
                objects[j] = buffer[i];
                j++;
            }
        }
    }
    public T peek() {
        return (T) objects[objects.length - 1];
    }
    public T pop() {
        Object resultPop = objects[objects.length - 1];
        Object[] buffer;
        buffer = objects;
        objects = new Object[buffer.length - 1];
        for(int i = 0, j = 0; i < buffer.length - 1; i++) {
            objects[j] = buffer[i];
            j++;
        }
        return (T) resultPop;
    }
}
