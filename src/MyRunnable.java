package ru.sbt.threads;

public class MyRunnable implements Runnable {
    private final int id;

    public MyRunnable(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        while (System.currentTimeMillis() - start < 10 * id) {
            long n = 1;
            for (int i = 1; i < id * 2; i++) {
                n = n * i;
            }
        }
    }
}
