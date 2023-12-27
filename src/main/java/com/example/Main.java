package com.example;

public class Main {
    public static void main(String[] args) {

        Hashmap<String, Integer> obj = new Hashmap<>();
        String s = "Paranoids are not\r\n" + //
                "paranoid because they are paranoid but\r\n" + //
                "because they keep putting themselves\r\n" + //
                "deliberately into paranoid avoidable\r\n" + //
                "situations";

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