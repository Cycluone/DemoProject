package com.t.demoproject.useFunction;

import java.util.function.BiFunction;
import java.util.function.DoubleFunction;
import java.util.function.Function;

public class exampleFunction {
    public static void main(String[] args) {
        UseBiFunctionComputeTest();
    }

    /**
     * =================================================================
     */
    //直接使用
    public static Integer compute(int a, Function<Integer, Integer> function) {
        return function.apply(a);
    }

    /**
     * 调用过程
     * 先得出func2的结果   给到func1   再由func1 计算最终结果
     *
     * @param a
     * @param func1
     * @param func2
     * @return
     */
    //双层函数调用
    public static Integer compute(int a, Function<Integer, Integer> func1, Function<Integer, Integer> func2) {
        return func1.compose(func2).apply(a);
    }

    /**
     * 调用过程
     * func1 的出结果后   给到func2   然后由func2给出最后结果
     *
     * @param a
     * @param func1
     * @param func2
     * @return
     */
    // Use AndThen
    public static Integer compute2(int a, Function<Integer, Integer> func1, Function<Integer, Integer> func2) {
        return func1.andThen(func2).apply(a);
    }

    /**
     * @param a
     * @param b
     * @param function
     * @return
     */

    // Use BiFunction
    public static Integer compute2(int a, int b, BiFunction<Integer, Integer, Integer> function) {
        return function.apply(a, b);
    }

    // Use andThen for BiFunction
    public static Integer computeUseAndThen(int a, int b, BiFunction<Integer, Integer, Integer> func1, Function<Integer, Integer> func2) {
        return func1.andThen(func2).apply(a, b);
    }


    /**
     * =================================================================
     */


    public static void t1() {
        DoubleFunction<Double> function = (double v) -> v + 1.0;
        Double apply = function.apply(2);
        System.out.println(apply);
    }

    public static void computeTest1() {
        System.out.println(compute(3, v -> v * v));
        System.out.println(compute(3, v -> v - v));
        System.out.println(compute(3, v -> v / v));
        System.out.println(compute(3, v -> v + v));
    }


    public static void computeTest2() {
        System.out.println(compute(3, (v) -> v * v, (v) -> v - 1));
        System.out.println(compute(3, (v) -> v / v, (v) -> v - 1));
        System.out.println(compute(3, (v) -> v + v, (v) -> v - 1));
        System.out.println(compute(3, (v) -> v - v, (v) -> v - 1));
        System.out.println(compute(2, value -> value * 3, value -> value * value));
        System.out.println(compute2(5, value -> value * 3, value -> value * value));
    }

    public static void UseBiFunctionComputeTest() {
        System.out.println(compute2(2, 2, (v1, v2) -> v1 * v2));
    }

    public static void UseAndThenForBiFunctionComputeTest() {
        System.out.println(computeUseAndThen(2, 2, (v1, v2) -> v1 + v2, v -> v + 1));
    }


}
