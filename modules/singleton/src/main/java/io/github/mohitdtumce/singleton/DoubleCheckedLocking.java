package io.github.mohitdtumce.singleton;

public class DoubleCheckedLocking {
    private volatile static DoubleCheckedLocking obj;

    private DoubleCheckedLocking() {

    }

    public static DoubleCheckedLocking getInstance() {
        if (obj == null) {
            synchronized (DoubleCheckedLocking.class) {
                if (obj == null) {
                    obj = new DoubleCheckedLocking();
                }
            }

        }
        return obj;
    }
}
