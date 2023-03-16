package org.example;

public class Main {
    public static void main(String[] args) {

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