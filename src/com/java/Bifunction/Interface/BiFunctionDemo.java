package com.java.Bifunction.Interface;

import java.util.function.BiFunction;

public class BiFunctionDemo implements BiFunction<Integer,Integer,Integer> {

    //Conventional Way of implementing BiFunctional interface
    @Override
    public Integer apply(Integer t, Integer u) {
        return (t + u);
    }
//
//    public static void main(String[] args) {
//        BiFunction<Integer,Integer,Integer> biFunction = new BiFunctionDemo();
//        System.out.println(biFunction.apply(20,30));

    // BiFunction in lambda Expression

    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> biFunction =( t, u)-> (t + u);
        System.out.println(biFunction.apply(20,30));
        };



    }

