package org.example;

import java.util.*;

public class SetOverView {
    public static void main(String[] args) {
        Set<Integer> st = new HashSet<>();
        List<Integer>lst = Arrays.asList(10,2,3,4,5,6,6);
        st.add(12);
        st.addAll(lst);

        for(Integer i : st){
            System.out.println(i);
        }
    }
}
