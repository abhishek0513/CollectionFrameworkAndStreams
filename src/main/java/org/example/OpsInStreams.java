package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class OpsInStreams {
    public static void main(String[] args) {
        //Intermidate operation are used to convert a stream into one different stream;
        //They are lazy, meaning they don't execute until a terminal operation is invoked;

        //1) Filter method
        List<String>list = Arrays.asList("ABC", "Xyz", "qwerTy", "ABC", "axxw", "aqw", "kjhgf");
//        Stream<String> stream = list.stream().filter(x -> x.startsWith("A"));
        Stream<String> a = list.stream().filter(x -> x.startsWith("A"));
        long count = a.count();
        System.out.println(count);

        //2) map
        Stream<String> stringStream = list.stream().map(String::toUpperCase);
        stringStream.forEach(System.out::println);
        

        //3) sorted
        Stream<String> sorted = list.stream().sorted();
        Stream<String> sortedDecs = list.stream().sorted((m,n) -> m.length() - n.length());
        sortedDecs.forEach(System.out::println);



        //4) Distinct
        Stream<String> distinct = list.stream().distinct();
        long count1 = distinct.count();
        System.out.println(count1);
        list.stream().forEach(System.out::println);


        //Skip
        System.out.println(Stream.iterate(1 , x -> x+1).skip(10).limit(10).count());
    }
}
