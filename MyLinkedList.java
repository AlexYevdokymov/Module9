package org.example;


import javax.swing.plaf.nimbus.NimbusStyle;

public class MyLinkedList<T> {
    private Node<T> head;
    private Node<T> last;
    public void add(T item){
        Node<T> node = new Node<>();
        node.setValue(item);

        if (head == null) {
            head = node;
        } else {
            Node<T> last = head;
            while (last.getNext() != null) {
                 last = last.getNext();
            }
            last.setNext(node);
            node.setPrev(last);
        }
    }

    public int size() {
        if (head == null) {
            return 0;
        }
        int count = 1;
        Node<T> last = head;
        while (last.getNext() != null){
            last = last.getNext();
            count++;
        }
        return count;
    }
    public T get(int index) {
        if(head == null) {
            throw new IndexOutOfBoundsException("0 elements in the list");
        }
        Node<T> search = head;
        for(int i = 0; i < index; i++) {
            search = search.getNext();
        }
        return search.getValue();
    }

    public void remove(int index) {
        if(head == null) {
            throw new IndexOutOfBoundsException("0 elements in the list");
        }
        Node<T> toRemove = head ;
        for(int i = 0; i < index; i++) {
            toRemove = toRemove.getNext();
        }
        Node<T> next = toRemove.getNext();
        Node<T> prev = toRemove.getPrev();
        toRemove.setValue(null);
        prev.setNext(next);
        next.setPrev(prev);
    }

    public void clear() {
        head = null;
        last = null;
    }

    private static class Node<T> {
        private T value;
        private Node<T> next;
        private Node<T> prev;

        public Node (){
        }
        public Node (Node<T> prev, T value, Node<T> next){
            this.prev = prev;
            this.value = value;
            this.next = next;
        }
        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public Node<T> getPrev() {
            return prev;
        }

        public void setPrev(Node<T> prev) {
            this.prev = prev;
        }
    }

}
