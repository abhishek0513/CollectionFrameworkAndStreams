package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Stacks {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(0);
        lst.add(0);
        lst.add(0);
        lst.add(0);
        Stack<Integer> st = new Stack<>();
        st.addAll(lst);
        st.add(1);
        st.add(2);
        st.add(3);
        st.push(7);
        System.out.println(st.size());
        while(!st.empty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
}
