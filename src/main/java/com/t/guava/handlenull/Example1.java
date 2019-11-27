package com.t.guava.handlenull;


import com.google.common.base.Optional;

/**
 * @author star
 */
public class Example1 {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Optional<Integer> optional = Optional.of(5);
        //get method
        Integer integer = optional.get();

        Optional<Object> absent = Optional.absent();
        System.out.println(absent.get());

        System.out.println(integer);
    }
}
