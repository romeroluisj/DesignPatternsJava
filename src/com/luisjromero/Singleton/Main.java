package com.luisjromero.Singleton;

public class Main {
    public static void main(String[] args) {
        LazyInitializationSingleton lis = LazyInitializationSingleton.getInstance();
        lis.printHello();

        EagerInitializationSingleton eis = EagerInitializationSingleton.getInstance();
        eis.printHello();

        FactoryManager fm = FactoryManager.getInstance();
        fm.startTracks();
        fm.resetTracks();
        fm.startTracks();
    }
}
