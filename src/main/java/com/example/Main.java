package com.example;

public class Main {
    public static void main(String[] args) {

        Hashmap<String, Integer> obj = new Hashmap<>();
        String s = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";

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

        System.out.println("Map before removign paranoid");
        obj.display();
        System.out.println();
        
        obj.remove("avoidable");

        System.out.println("Map after removign paranoid");
        obj.display();

        
    }
}