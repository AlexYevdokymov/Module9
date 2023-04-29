package org.example;

public class MyQueue<T> {
    private Object[] objects = new Object[10];
    private int queueSize = 0;

    public void add(T value) {
        if(queueSize == objects.length) {
            int newSize = objects.length + Math.round(1.5f * objects.length);
            Object[] newObjects = new Object[newSize];
            System.arraycopy(objects, 0, newObjects, 0, objects.length);
            objects = newObjects;
        }
        objects[queueSize] = value;
        queueSize++;
    }

    public int size() {
        return queueSize;
    }
    public void clear() {
        objects = null;
        queueSize = 0;
    }
    public T peek() {
        return (T) objects[0];
    }
    public T poll() {
        Object resultPoll = objects[0];
        if (queueSize == 1) {
            objects[0] = null;
        } else {
            for (int i = 0; i < queueSize; i++) {
                objects[i] = objects[i + 1];
            }
        }
        queueSize--;
        return (T) resultPoll;
    }
}
