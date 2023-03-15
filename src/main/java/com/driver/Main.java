package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

        obj.setName("ritesh");

        System.out.print(obj.getName());
    }
}