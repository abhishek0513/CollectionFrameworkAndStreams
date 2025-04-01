package org.example;

import java.util.HashMap;
import java.util.Map;

public class HashCodeAndEqualsMEthod {
    public static void main(String[] args) {
        HashMap<Person, String> mp = new HashMap<>();
        Person p1 = new Person("John", 101);
        Person p2 = new Person("Alis", 102);
        Person p3 = new Person("John", 101);
        mp.put(p1, "Engineer"); //hashcode --> index
        mp.put(p2, "Doctor");
        mp.put(p3, "Manager");

        System.out.println(mp.size());
        System.out.println("Values of P1 " + mp.get(p1));
        System.out.println("Values of P2 " + mp.get(p2));
        for(Map.Entry<Person, String>entry : mp.entrySet()){
            System.out.println(entry.getKey().getName() + " -> " + entry.getValue());
        }
        for(Person key : mp.keySet()){
            System.out.println(key.getName());
        }

    }
}


class Person{

    private String name;
    private int id;
     public Person (String name , int id){
         this.name = name;
         this.id = id;
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    @Override
//    public String toString(){
//         return name;
//    }
}