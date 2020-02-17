package io.github.mohitdtumce.singleton;

public class ClassicSingleton {
    private static ClassicSingleton classicSingleton = null;

    private ClassicSingleton() {

    }

    public static ClassicSingleton getInstance() {
        if (classicSingleton == null) {
            classicSingleton = new ClassicSingleton();
        }
        return classicSingleton;
    }
}
