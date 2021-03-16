package com.ciklum.hybris.internship.sesection.concurrency.synchron;

import com.ciklum.hybris.internship.sesection.concurrency.synchron.model.Sequence;

public class SynchronizeHandler {

    public void handleSynchronize() {
        Sequence sequence = new Sequence();
        Worker worker1 = new Worker(sequence);
        Worker worker2 = new Worker(sequence);
        worker1.start();
        worker2.start();

    }

    class Worker extends Thread {
        private Sequence sequence;

        public Worker(Sequence sequence) {
            this.sequence = sequence;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()
                        + " got value: " + sequence.getNext());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
