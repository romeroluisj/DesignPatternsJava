package com.luisjromero.Singleton;

public class LazyInitializationSingleton {

    /*
    Lazy Initialization Singleton
    The Singleton instance is created only once: the first time it is requested.
    This works in single-threaded environment only
     */
    private static LazyInitializationSingleton instance = null;

    private LazyInitializationSingleton() {}

    public static LazyInitializationSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializationSingleton();
        }
        return instance;
    }

    public void printHello() {
        System.out.println("Hello, I'm a LAZY initialization singleton");
    }
}
