package org.example;

import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        //vectors are threads safe and are synchronised
        Vector<Integer>vec = new Vector<>();
        System.out.println(vec.capacity());
    }
}
