package com.java.BiPredicate.Example;

import java.util.function.BiPredicate;



/// Bi predicate for comparing two values ## Using lambda Expression
public class BiPredicateDemo  {
    public static void main(String[] args) {
        BiPredicate<String,String> biPredicate = ( s,  s2)->  s.equals(s2);
         BiPredicate<Integer, Integer> biPredicate1 =(x,y)-> x >y;
        BiPredicate<Integer, Integer> biPredicate2 =(x,y)-> x ==y;

        System.out.println(  biPredicate.test("Ball","Blla"));
        System.out.println(  biPredicate.test("Baby","BAby"));
        System.out.println(  biPredicate.test("son","soN"));
        System.out.println(  biPredicate.test("don","don"));

     boolean result =   biPredicate1.and(biPredicate2).test(10,12);
        System.out.println(result);

        boolean result1 =   biPredicate1.or(biPredicate2).test(90,12);
        System.out.println(result1);
    }


}


/// Bi predicate for comparing two values
//public class BiPredicateDemo implements BiPredicate<String,String> {
//    public static void main(String[] args) {
//        BiPredicate<String,String> biPredicate = new BiPredicateDemo();
//        System.out.println(  biPredicate.test("Ball","Blla"));
//        System.out.println(  biPredicate.test("Baby","BAby"));
//        System.out.println(  biPredicate.test("son","soN"));
//        System.out.println(  biPredicate.test("don","don"));
//    }
//
//    @Override
//    public boolean test(String s, String s2) {
//        return s.equals(s2);
//    }
//}