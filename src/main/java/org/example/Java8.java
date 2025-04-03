package org.example;

import javax.swing.plaf.TableHeaderUI;
import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Task implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello world");
    }
}


@FunctionalInterface
interface MathOperation{
    int operate(int a, int b);
}

class Mobile{
    String name;
    public Mobile(String name){
        this.name = name;
    }
}


public class Java8 {
    public static void main(String[] args) {
        //Streams

        //Java 8 --> minimal code writting, functional programming
        //Java 8 --> Lamdba expression, Streams, DateAndTimeAPI
        //Lambda Expression : is a anonymous function (no name, no return type, no access modifier)
//        Thread t1 = new Thread(new Task());
//        In place of above sentence we can use;
        Thread t1 = new Thread(()->{
            System.out.println("Hello world!!");
        });

        MathOperation mathOperation = (a,b) -> a+b;
        int res = mathOperation.operate(1,2);
        System.out.println(res);

        Predicate<Integer> predicate = x -> x%2 == 0 ;
        System.out.println(predicate.test(4));

        //function
        Function<Integer, Integer>doubleIt =  x -> x*2;
        System.out.println(doubleIt.apply(100));
        //Method referance-> use method without invoking and is used in place of lamdba expression
        List<String> lst = Arrays.asList("John", "Smith", "Salt");
        lst.forEach(x -> System.out.println(x));
        lst.forEach(System.out::println);

        //Constructor reference;
        List<String> name = Arrays.asList("A", "B", "C");
        List<Mobile>phones =  name.stream().map(Mobile::new).collect(Collectors.toList());
    }
}
