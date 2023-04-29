package org.example;

public class MyStack<T> {
    private Object[] objects = new Object[10];
    private int stackSize = 0;

    public void push(T value) {
        if(stackSize == objects.length) {
            int newSize = objects.length + Math.round(1.5f * objects.length);
            Object[] newObjects = new Object[newSize];
            System.arraycopy(objects, 0, newObjects, 0, objects.length);
            objects = newObjects;
        }
        objects[stackSize] = value;
        stackSize++;
    }

    public int size() {
        return stackSize;
    }
    public void clear() {
        objects = null;
        stackSize = 0;
    }
    public void remove(int index) {
        if (index >= stackSize || index < 0) {
            System.out.println("Can not remove an element with index out of bound");
            return;
        }
        if (index == stackSize - 1) {
            objects[index] = null;
        } else {
            for (int i = index; i < stackSize; i++) {
                objects[i] = objects[i + 1];
            }
        }
        stackSize--;
    }
    public T peek() {
        return (T) objects[stackSize - 1];
    }
    public T pop() {
        Object resultPop = objects[stackSize - 1];
        objects[stackSize - 1] = null;
        stackSize--;
        return (T) resultPop;
    }
}
