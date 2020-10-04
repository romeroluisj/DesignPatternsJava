package com.luisjromero.Singleton;

public class EagerInitializationSingleton {

    /*
    Eager Initialization Singleton
    The Singleton instance is always created, even if one is not currently needed.
    This works in single-threaded environment only
     */
    private static final EagerInitializationSingleton INSTANCE = new EagerInitializationSingleton();

    private EagerInitializationSingleton() {}

    public static EagerInitializationSingleton getInstance() {
        return INSTANCE;
    }

    public void printHello() {
        System.out.println("Hello, I'm an EAGER initialization singleton");
    }
}
