package com.example;

public class Node<K,V> {
    K key;
    V value;
    Node<K,V> next;

    Node(K key, V value)
    {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public K getKey()
    {
        return this.key;
    }

    public V getValue()
    {
        return this.value;
    }

}
