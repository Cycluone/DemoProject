package com.t.guava.exception;

import com.google.common.base.Throwables;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Example1Test {
    @Test
    void t1() {
        try {
            throw  new NullPointerException("jlksjdflsj");
        } catch (Exception e) {
            List<Throwable> causalChain = Throwables.getCausalChain(e);
            Arrays.stream(causalChain.toArray()).forEach(System.out::println);
            String stackTraceAsString = Throwables.getStackTraceAsString(e);
            System.out.println(stackTraceAsString);
            Throwable rootCause = Throwables.getRootCause(e);
            System.out.println(rootCause.getCause().toString());
        }
    }
}