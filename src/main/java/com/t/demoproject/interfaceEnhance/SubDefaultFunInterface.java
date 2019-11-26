package com.t.demoproject.interfaceEnhance;

public class SubDefaultFunInterface implements DefaultFunInterface {
    public static void main(String[] args) {
        SubDefaultFunInterface sub = new SubDefaultFunInterface();
        System.out.println(sub.count());
    }
}
