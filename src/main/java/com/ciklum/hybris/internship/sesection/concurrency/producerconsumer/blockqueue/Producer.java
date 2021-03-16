package com.ciklum.hybris.internship.sesection.concurrency.producerconsumer.blockqueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    int questionNumber;
    BlockingQueue<Integer> blockingQueue;

    public Producer(BlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                synchronized (this) {
                    questionNumber++;
                    blockingQueue.put(questionNumber);
                    System.out.println("Question: " + questionNumber + " is added.");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
