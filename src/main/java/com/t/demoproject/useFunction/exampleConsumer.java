package com.t.demoproject.useFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class exampleConsumer {
    /**
     * Consumer use
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        BiConsumer<List<String>, Consumer<String>> consumer = (List<String> t, Consumer<String> c) -> forEach(Arrays.asList("1", "2", "3"), (String a) -> System.out.println(a));

        /*forEach(Arrays.asList(1,2,3,4,5,6),(i)->{
            System.out.println(i);
        });*/
    }
    public static <T> void forEach(List<T> t,Consumer<T> c){
        for (T t1 : t) {
            c.accept(t1);
        }
    }
}
