package com.example.clipboardmanager;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor {
    private static final ExecutorService pool = Executors.newFixedThreadPool(1);

    public static void execute(Runnable runnable) {
        pool.execute(runnable);
    }

    public static void shutDown() {
        pool.shutdown();
    }
}
