package org.example;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
//        int []arr = new int[10];//Older way as anything morethan 10 can be there
        List<Integer> arrayList = new ArrayList<>();
//        arrayList.add(1);
//        int element = arrayList.get(0);
//        System.out.println(element);
//        arrayList.addAll();
//        arrayList.get(1); exception check
//        try
//        {
//            int element = arrayList.get(0);
//            System.out.println(element);
//        }
//        catch (Exception e){
//            System.out.println("Out of bound");
//        }
        int k = 1;
        for(int i =0; i < 10; i++){
            arrayList.add(k);
            k++;
        }
        for(Integer i : arrayList){
            System.out.println(i.toString());
        }
//        boolean  ans = arrayList.contains(5);
//        System.out.println(ans);
        arrayList.remove(2);
        System.out.println(arrayList);
    }
}
