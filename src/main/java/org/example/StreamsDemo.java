package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;



public class StreamsDemo {
    public static int  Count(List<Integer> lst){
        int count = 0;
        for(Integer i:lst){
            if(i %2 == 0)
                count+=1;
        }
        return count;
    }

    public static void main(String[] args) {
        //feature in Java 8
        //used to process collection of data in a functional and declarative way;
        // Simply data processing
        //Embrace functional programming
        //Improve readability and Maintainability
//Streams are sequence of elements supporting various operations
        //How to use stream ???
        //Source -> Intermediate Operation -> Terminal Operation
        List<Integer>number = Arrays.asList(1,3,5,6,7,8,9,0,23,2);
        //Number is Source : Want to convert into stream
//        Stream<Integer> stream = number.stream();
//        number.stream().

        //Check even number;
        int count = Count(number);
        System.out.println(count);
        System.out.println(number.stream().filter(x -> x % 2 == 0).count());
        //creating stream

    }
}
