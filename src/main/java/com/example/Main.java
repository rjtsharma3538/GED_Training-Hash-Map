package com.example;

public class Main {
    public static void main(String[] args) {

        Hashmap<String, Integer> obj = new Hashmap<>();
        String s = "To be or not to be";

        s = s.toLowerCase();

        String word = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (obj.find(word))
                    obj.add(word, obj.get(word) + 1);
                else
                    obj.add(word, 1);
                word = "";
            } else
                word = word + s.charAt(i);
        }

        if (word.length() != 0) {
            if (obj.find(word))
                obj.add(word, obj.get(word) + 1);
            else
                obj.add(word, 1);
        }

        obj.display();
    }
}