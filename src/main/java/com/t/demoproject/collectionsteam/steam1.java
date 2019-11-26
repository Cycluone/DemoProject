package com.t.demoproject.collectionsteam;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class steam1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10000000
                ; i++) {
            double v = Math.random() * 1000;
            list.add(v + "");
        }

        long start = System.nanoTime();
        list.stream().sequential().sorted().close();
        long end = System.nanoTime();
        long start1 = System.nanoTime();
        list.stream().parallel().sorted().close();
        long end1 = System.nanoTime();
        long millis = end - start;
        long millis1 = end1 - start1;
        System.out.println(millis1+"===" + millis);


    }
}
