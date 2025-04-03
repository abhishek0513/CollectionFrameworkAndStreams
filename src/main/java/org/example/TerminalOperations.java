package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperations {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,2,3,4,5,6,7,8,2);
        //1) Collect
        List<Integer> collect = list.stream().skip(6).collect(Collectors.toList());
        System.out.println(collect);

        //2) ForEach
        list.stream().forEach(System.out::println);

        //3) Reduce: Combine element to produce a single result;
        Optional<Integer> optionalInteger = list.stream().reduce((a, b) -> a + b);
        System.out.println(optionalInteger.get());

        //4 count

        //5) AnyMatch, allmatch, nonematch;
        boolean b = list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(b);

        //6) FindFirst and findAny
        Optional<Integer> first = list.stream().findFirst();
        Optional<Integer> any = list.stream().findAny();
        System.out.println(first.get() + " " + any.get());

        //Example
        List<Integer>number = Arrays.asList(1,23,4,5,6,7);
        System.out.println(number.stream().map(x -> x*x).sorted().toList());

        // Example : sum values
        List<Integer>numbers = Arrays.asList(1,23,4,5,6,7);
        System.out.println(numbers.stream().reduce(Integer::sum).get());

        //counting occurences
        String sentence = "Hello World";
//        char[] charArray = sentence.toCharArray();
        long count = sentence.chars().filter(x -> x == 'l').count();
        System.out.println(count);
    }
}
