package org.example;

public class Main {
    public static void main(String[] args) {

        MyQueue myQueue = new MyQueue();
        myQueue.add(3422);
        myQueue.add("Asfasahry");
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());

        MyStack myStack = new MyStack();
        System.out.println(myStack.size());
        myStack.push("Hello");
        myStack.push("Hello");
        myStack.push("Hello");
        System.out.println(myStack.size());
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.size());
        System.out.println();



        String[] objectWords = new String[]{"Hello","world","I","am","object"};
        Integer[] objectInts = new Integer[]{3,4,26,1,6,12,0,4,2,45};
        MyArrayList myArrayList1 = new MyArrayList(objectWords);
        MyArrayList myArrayList2 = new MyArrayList(objectInts);
        System.out.println(myArrayList1.get(3));
        System.out.println(myArrayList1.get(0));
        System.out.println(myArrayList2.get(4));
        System.out.println(myArrayList2.get(2));
        myArrayList1.add("word");
        myArrayList1.add(432532f);
        System.out.println(myArrayList1.get(4));
        System.out.println(myArrayList1.get(5));
        System.out.println("Size of myArrayList1 = " + myArrayList1.size());
        myArrayList1.remove(3);
        System.out.println(myArrayList1.get(2) + " " + myArrayList1.get(3) + " " + myArrayList1.get(4));
        System.out.println("Size of myArrayList1 = " + myArrayList1.size());
        System.out.println("Size of myArrayList1 = " + myArrayList1.size());
        myArrayList1.clear();
        System.out.println("Size of myArrayList1 = " + myArrayList1.size());
    }
}