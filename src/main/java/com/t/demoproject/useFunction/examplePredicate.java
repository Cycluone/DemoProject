package com.t.demoproject.useFunction;

import java.nio.file.DirectoryStream;
import java.util.function.*;

public class examplePredicate {
    public static void main(String[] args) {
        /**
         * 这个Predicate接受一个
         *
         *
         *
         */
        Predicate<String> EmptyStringPredicate = (String s) -> s.isEmpty();

        IntPredicate booleanIntFunction = (int i) -> i % 2 == 0;
        System.out.println(booleanIntFunction.test(2));

        Predicate<Integer> box=(Integer i) -> i % 2 == 1;
        System.out.println(box.test(2));

    }
}
