package com.patterns.creational.singleton;

public class SingletonMain {

    public static void main(String[] args) {

        DbSingletonThreadSafe instance1 = DbSingletonThreadSafe.getInstance();
        DbSingletonThreadSafe instance2 = DbSingletonThreadSafe.getInstance();


        if (instance1 == instance2) {
            System.out.println("The same objects");
        }
    }
}
