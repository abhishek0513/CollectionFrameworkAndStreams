package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreams {
    public static long fact(int n){
//        long result = 1;
//        for(int i = 2; i <= n; i++){
//            result
//            return result;*= i;
//        }

        return IntStream.rangeClosed(2,n).reduce(1, (a,b)->a*b);
    }
    public static void main(String[] args) {
        // A type of stream that enable parallel processing of elements
        //Allowing multiple threads to process parts of stream simultaneously
        //improve performance if data set is very big
        //workload is distributed across different threads;
        long startTime = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(20000).toList();
        List<Long> factorialList = list.stream().map(ParallelStreams::fact).toList();
        long endTime = System.currentTimeMillis();
        System.out.println("Time Taken by stream  : " + (endTime-startTime));

         startTime = System.currentTimeMillis();
         factorialList = list.parallelStream().map(ParallelStreams::fact).toList();
         endTime = System.currentTimeMillis();
        System.out.println("Time Taken by stream  : " + (endTime - startTime));


        //Cumulative sum
        List<Integer> addList = Arrays.asList(12, 3, 4, 56, 7);
//        final int[] sum = {0};
//        List<Integer> list1 = addList.stream().map((x) -> {
//            int i = sum[0] + x;
//            sum[0] = i;
//            return i;
//        }).toList();

        AtomicInteger sum = new AtomicInteger(0);
        List<Integer> list1 = addList.stream().map(sum::addAndGet).toList();

        System.out.println(list1);

    }
}
