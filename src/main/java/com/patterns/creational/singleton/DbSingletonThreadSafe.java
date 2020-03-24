package com.patterns.creational.singleton;

public class DbSingletonThreadSafe {

    private static volatile DbSingletonThreadSafe instance = null;


    private DbSingletonThreadSafe() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance(), bitch");
        }
    }

    public static DbSingletonThreadSafe getInstance() {
        if (instance == null) {
            synchronized (DbSingletonThreadSafe.class) {
                if (instance == null)
                    instance = new DbSingletonThreadSafe();
            }
        }
        return instance;
    }
}
