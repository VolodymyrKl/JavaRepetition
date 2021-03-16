package com.ciklum.hybris.internship.sesection.concurrency.producerconsumer.blockqueue;

import com.ciklum.hybris.internship.sesection.logging.LogHandler;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Logger;

public class App {
    static Logger logger = LogHandler.implementLogger();

    public static void main(String[] args) {
        logger.info("Print result of an implementing producer-consumer pattern with blocking queue");
        BlockingQueue<Integer> questionQueue = new ArrayBlockingQueue<>(5);
        new Thread(new Producer(questionQueue)).start();
        new Thread(new Consumer(questionQueue)).start();
    }
}
