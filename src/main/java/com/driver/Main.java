package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        obj.set("ritesh");
        System.out.print(obj.get());
    }
}