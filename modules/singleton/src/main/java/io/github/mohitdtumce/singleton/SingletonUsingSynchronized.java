package io.github.mohitdtumce.singleton;

public class SingletonUsingSynchronized {
    private static SingletonUsingSynchronized obj;

    private SingletonUsingSynchronized() {

    }

    // Synchronization in Java is its ability to control the access of multiple threads to any shared resource.
    // Java synchronization is better option when we want to allow only one thread to access the shared resource at a time.

    // Types of synchronizations :-
    // 1. Synchronized method (Used here)
    // 2. Synchronized block
    // 3. Static Synchronization
    public static synchronized SingletonUsingSynchronized getInstance() {
        if (obj == null) {
            obj = new SingletonUsingSynchronized();
        }
        return obj;
    }
}
