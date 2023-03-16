package org.example;

public class MyArrayList {
    private Object[] objects;
    public MyArrayList(Object [] objects) {
        this.objects = objects;
    }

    public Object get(int index) {
        return objects[index];
    }

    public int size() {
        return objects.length;
    }
    public void clear() {
        objects = new Object[0];
    }

    public void add(Object value) {
        Object[] buffer;
        buffer = objects;
        objects = new Object[objects.length + 1];
        int i = 0;
        for(Object buff : buffer) {
            objects[i] = buff;
            i++;
        }
        objects[objects.length - 1] = value;
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
}
