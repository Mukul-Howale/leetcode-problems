package org.example;

public class Main {
    private static Execute ex;

    public static void main(String[] args) {
        System.out.println("Welcome!");

        ex = new Execute();
        storeObject();
        ex.start();
    }

    private static void storeObject(){
        new ObjectStore(ex);
    }
}