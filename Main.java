package org.example;

public class Main {
    public static void main(String[] args) {
        ////////////// MyQueue testing
        MyQueue<Integer> myQueue = new MyQueue<>();
        System.out.println("myQueue.size() = " + myQueue.size());
        myQueue.add(3422);
        System.out.println("myQueue.size() = " + myQueue.size());
        myQueue.add(65);
        System.out.println("myQueue.size() = " + myQueue.size());
        System.out.println(myQueue.poll());
        System.out.println("myQueue.size() = " + myQueue.size());
        System.out.println(myQueue.poll());
        System.out.println("myQueue.size() = " + myQueue.size());
        myQueue.add(1);
        myQueue.add(3422);
        myQueue.add(3422);
        myQueue.add(3422);
        System.out.println("myQueue.peek() = " + myQueue.peek());
        System.out.println("myQueue.size() = " + myQueue.size());
        myQueue.clear();
        System.out.println("myQueue.size() = " + myQueue.size());
//
//        MyStack myStack = new MyStack();
//        System.out.println(myStack.size());
//        myStack.push("Hello");
//        myStack.push("Hello");
//        myStack.push("Hello");
//        System.out.println(myStack.size());
//        System.out.println(myStack.peek());
//        System.out.println(myStack.pop());
//        System.out.println(myStack.size());
//        System.out.println();

        ////////////// MyArrayList testing
        MyArrayList<String> myArrayList = new MyArrayList<String>();
        myArrayList.add("Welcome");
        myArrayList.add("to");
        myArrayList.add("fabulous");
        myArrayList.add("Las Vegas");
        System.out.println("myArrayList.get(3) = " + myArrayList.get(3));
        System.out.println("myArrayList.get(0) = " + myArrayList.get(0));
        System.out.println("myArrayList.size() = " + myArrayList.size());
        System.out.println();
        for(int i = 0; i < 120; i++) {
            myArrayList.add(String.valueOf(i));
        }

        System.out.println("myArrayList.get(56) = " + myArrayList.get(56));
        System.out.println("myArrayList.size() = " + myArrayList.size());
        System.out.println();
        myArrayList.remove(2);
        System.out.println("myArrayList.size() = " + myArrayList.size());
        myArrayList.clear();
        System.out.println("myArrayList.size() = " + myArrayList.size());
        System.out.println();
        System.out.println();

        ////////////// MyLinkedList testing
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        System.out.println("myLinkedList.size() = " + myLinkedList.size());
        myLinkedList.add("Hello");
        myLinkedList.add("World");
        myLinkedList.add("Full");
        myLinkedList.add("Of");
        myLinkedList.add("Happiness");
        System.out.println("myLinkedList.size() = " + myLinkedList.size());
        System.out.println("myLinkedList.get(2) = " + myLinkedList.get(2));
        System.out.println("myLinkedList.get(3) = " + myLinkedList.get(3));
        myLinkedList.remove(3);
        System.out.println("myLinkedList.get(2) = " + myLinkedList.get(2));
        System.out.println("myLinkedList.get(3) = " + myLinkedList.get(3));
        myLinkedList.clear();
        System.out.println("myLinkedList.size() = " + myLinkedList.size());
    }
}