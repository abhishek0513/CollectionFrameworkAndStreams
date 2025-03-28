package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//import java.util.concurrent.ConcurrentMap;

class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        int x = o1.length() - o2.length();
        if(x == 0)
            return o1.compareTo(o2);
        return x;
    }
}


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
//        int k = 1;
//        for(int i =0; i < 10; i++){
//            arrayList.add(k);
//            k++;
//        }
//        for(Integer i : arrayList){
//            System.out.println(i.toString());
//        }
////        boolean  ans = arrayList.contains(5);
////        System.out.println(ans);
//        arrayList.remove(2);
//        System.out.println(arrayList);

//        List<String>lst = Arrays.asList("India", "USA", "UK");
//        List<Integer>lst1 = List.of(1,5,7,4);
//        lst1.set(1, 5);
//        List<Integer>lst2 = new ArrayList<>(lst1);
//        lst2.addAll(lst1);
//        lst2.remove(Integer.valueOf(2));
//        lst2.sort(null);

//        System.out.println(lst2);
        List<String>lst = Arrays.asList("Mango", "Apple", "Banana");
        lst.sort(new StringLengthComparator());
        System.out.println(lst);
    }
}
