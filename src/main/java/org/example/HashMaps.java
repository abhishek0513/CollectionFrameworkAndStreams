package org.example;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<Integer, String>hashMap = new HashMap();
        hashMap.put(1, "John");
        hashMap.put(2, "Smith");
        hashMap.put(3, "Linus");
        System.out.println(hashMap);

        System.out.println(hashMap.containsKey(2));
    }
}
