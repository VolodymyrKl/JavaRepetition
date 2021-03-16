package com.ciklum.hybris.internship.sesection.concurrency.executorservice;

import com.ciklum.hybris.internship.sesection.logging.LogHandler;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class ThreadPoolDemo {
    static Logger logger = LogHandler.implementLogger();

    public static void main(String[] args) {
        logger.info("Print result from working threads in thread pool with executor service");
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Runnable processor = new MessageProcessor(5);
        executor.execute(processor);
        Runnable processor2 = new MessageProcessor(3);
        executor.execute(processor2);
        Runnable processor3 = new MessageProcessor(4);
        executor.execute(processor3);
        Runnable processor4 = new MessageProcessor(4);
        executor.execute(processor4);
        executor.shutdown();
        try {
            executor.awaitTermination(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Submitted all tasks. :)");
    }
}
