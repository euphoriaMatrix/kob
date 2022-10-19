package com.kob.botrunningsystem.service.impl.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author xwfstart
 * @create 2022-10-07 11:38
 */
public class ThreadPool {
    private static final ThreadPool threadPool = new ThreadPool();
    private static ExecutorService executorService;

    private ThreadPool() {
        executorService = Executors.newSingleThreadExecutor();
    }

    public static ThreadPool getInstance() {
        return threadPool;
    }

    public void createBotRunningThread(Runnable runnable) {
        if (runnable != null) {
            executorService.execute(runnable);
        }
    }
}
