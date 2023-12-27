package com.example;

import java.util.HashMap;
import java.util.Map;

public class Hashmap<K, V> {
    public Map<K, V> map;

    public Hashmap() {
        this.map = new HashMap<>();
    }

    public void add(K key, V value) {
        map.put(key, value);
    }

    public V get(K key) {
        return map.get(key);
    }

    public boolean find(K key) {
        return map.containsKey(key);
    }

    public void remove(K key) {
        if (find(key)) {
            map.remove(key);
        } else {
            System.out.println("Key not present");
        }
    }

    public void display() {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}
