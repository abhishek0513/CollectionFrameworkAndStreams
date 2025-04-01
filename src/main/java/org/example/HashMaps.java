package org.example;

import java.util.HashMap;
import java.util.Set;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<Integer, String>hashMap = new HashMap<>();
        System.out.println(hashMap);
        hashMap.put(1, "John");
        hashMap.put(2, "Smith");
        hashMap.put(3, "Linus");
        System.out.println(hashMap.containsKey(2));
        int key = 4;
        System.out.println(hashMap.get(key));

        Set<Integer> integers = hashMap.keySet();
        for(Integer i : integers){
            System.out.println(hashMap.get(i));
        }
    }
}
