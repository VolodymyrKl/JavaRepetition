package com.ciklum.hybris.internship.sesection.concurrency.simple;

public class SimpleThread {
    public void handleThread() {
        Thread task = new Thread(new Task());
        System.out.println("This is first Thread...");
        task.start();
        Thread task2 = new Thread(() -> {
            for (int i = 19; i >= 10; i--) {
                System.out.println(i + " - " + Thread.currentThread().getName());
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        task2.setName("I'm B-Thread");
        task2.start();
    }
}

class Task implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " - " + Thread.currentThread().getName());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
