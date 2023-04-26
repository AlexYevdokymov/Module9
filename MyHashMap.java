package org.example;
import java.util.Objects;

public class MyHashMap<K, V> {
    private Node<K, V>[] nodes;
    public MyHashMap() {
        nodes = new Node[3];
    }
    private int nodesSize = 0;
    public void put(K key, V value) {
        int hashKey = Objects.hash(key) % 3;
        Node<K, V> node = nodes[hashKey];
        if (node == null) {
            nodes[hashKey] = new Node<K, V>(key, value);
            nodesSize++;
        } else {
            while (node.next != null) {
                if (node.getKey() == key) {
                    node.setValue(value);
                    return;
                }
                node = node.next;
            }
            if (node.getKey() == key) {
                node.setValue(value);
                return;
            }
            node.next = new Node<K, V>(key, value);
            nodesSize++;
        }
    }
    public V get (K key) {
        int hashKey = Objects.hash(key) % 3;
        Node<K, V> node = nodes[hashKey];
        if (node == null) {
            return null;
        }
        while (node != null) {
            if (node.getKey() == key) {
                return node.getValue();
            }
            node = node.next;
        }
        return null;
    }
    public void remove(K key) {
        int hashKey = Objects.hash(key) % 3;
        Node<K, V> node = nodes[hashKey];

        if (node == null) {
            System.out.println("No such key \"" + key.toString() + "\" in myHashMap");
            return;
        }
        if (node.getKey() == key) {
            nodes[hashKey] = node.next;
            node.next = null;
            nodesSize--;
            return;
        }

        Node<K, V> prev = node;
        node = node.next;

        while (node != null) {
            if (node.getKey() == key) {
                prev.next = node.next;
                node.next = null;
                prev = node;
                node = node.next;
                nodesSize--;
                return;
            }
        }
        System.out.println("No such key \"" + key.toString() + "\" in myHashMap");
    }

    public void clear() {
        nodes = null;
        nodesSize = 0;
    }

    public int size() {
        return this.nodesSize;
    }

    static class Node<K, V> {
        private K key;
        private V value;
        private Node<K,V> next;

        public Node() {}
        public Node(K key, V value){
            this.key = key;
            this.value = value;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public Node<K, V> getNext() {
            return next;
        }

        public void setNext(Node<K, V> next) {
            this.next = next;
        }
    }
}
