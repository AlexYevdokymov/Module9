package org.example;

public class Main {
    public static void main(String[] args) {

//        MyQueue myQueue = new MyQueue();
//        myQueue.add(3422);
//        myQueue.add("Asfasahry");
//        System.out.println(myQueue.poll());
//        System.out.println(myQueue.poll());
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
    }
}