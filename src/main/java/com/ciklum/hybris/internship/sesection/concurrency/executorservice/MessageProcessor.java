package com.ciklum.hybris.internship.sesection.concurrency.executorservice;

public class MessageProcessor implements Runnable {
    private int message;

    public MessageProcessor(int message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " received message " + message);
        respondToMessage();
        System.out.println(Thread.currentThread().getName() + " done processing message " + message);
    }

    private void respondToMessage() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Unable to process " + message);
        }
    }
}
