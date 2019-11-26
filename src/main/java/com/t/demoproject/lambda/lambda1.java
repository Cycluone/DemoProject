package com.t.demoproject.lambda;

import com.t.demoproject.functionalInterface.Test;

import java.io.File;
import java.util.Arrays;
import java.util.function.Function;


/**
 *  一:lambda 语法格式
 *      一般表现为  ()->{} or (parameters)->{}
 *  二:简化匿名内部类的表述方式
 *      如:
 *      ---before---
 *      new Thread(new Runnable() {
 *             @Override
 *             public void run() {
 *                 System.out.println(".......");
 *             }
 *         });
 *      ---after----
 *      new Thread(()->{
 *             System.out.println("........");
 *      });
 *      //效果是一致的
 *  三:方法引用
 *     实现语法格式->::
 *     例:
 *      Function<Integer,String> function=String::valueOf;
 *
 */
public class lambda1 {
    public static void main(String[] args) {
        /**
         *  文件的筛选
         */
        /*File[] files = new File(".").listFiles(File::isFile);
        Arrays.stream(files).forEach(file -> System.out.println(file));*/
        //使用匿名
        Function<Integer, String> function = new Function<>() {
            @Override
            public String apply(Integer integer) {
                return null;
            }
        };

        //使用lambda
        Function<Integer, String> fun1=(t)->String.valueOf(t);
        String apply = fun1.apply(123213);
        System.out.println(apply);

        //使用方法引用
        Function<Integer,String> fun2=String::valueOf;
        String apply1 = fun2.apply(234234324);
        System.out.println(apply1);
    }


}
