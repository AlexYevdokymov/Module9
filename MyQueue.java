package org.example;

public class MyQueue<T> {
    private Object[] objects;

    public void add(T value) {
        if(objects == null) {
            objects = new Object[0];
        }
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
    public Object peek() {
        return objects[0];
    }
    public Object poll() {
        Object resultPop = objects[0];
        Object[] buffer;
        buffer = objects;
        objects = new Object[buffer.length - 1];
        for(int i = 0, j = 0; i < buffer.length; i++) {
            if(i != 0) {
                objects[j] = buffer[i];
                j++;
            }
        }
        return resultPop;
    }
}
