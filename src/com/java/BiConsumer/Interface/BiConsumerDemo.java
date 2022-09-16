package com.java.BiConsumer.Interface;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;



public class BiConsumerDemo  {
    public static void main(String[] args) {

        BiConsumer<Integer,Integer> biConsumer = (Integer a, Integer b) -> System.out.println( a + b);

        BiConsumer<Integer,Integer> subtraction = (Integer a, Integer b) -> System.out.println( a - b);


        biConsumer.accept(77,12);
        subtraction.accept(77,12);

        //How to use  Bi-Consumer functional interface forEach method in map interface
        Map<Integer,String> map = new LinkedHashMap<>();
        map.put(1,"java");
        map.put(2, "C++");
        map.put(3,"Rust");
        map.put(4,"Javascript");
        map.put(5,"Golang");

       map.forEach((k,v)->{
           System.out.print(k);
           System.out.print(v);
       });
    }


}

//public class BiConsumerDemo implements BiConsumer<Integer,Integer> {
//    public static void main(String[] args) {
//        // Normal way of using Bi-Consumer interface
////        BiConsumer<Integer,Integer> biConsumer = new BiConsumerDemo();
////        biConsumer.accept(77,12);
////    }
////
////
////    @Override
////    public void accept(Integer a, Integer b) {
////        System.out.println(a + b);
////    }