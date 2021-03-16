package com.ciklum.hybris.internship.sesection.concurrency.producerconsumer.simple;

import java.util.List;

public class Producer implements Runnable {
    private List<Integer> questionsList;
    private final int LIMIT = 5;
    private int questionNumber;

    public Producer(List<Integer> questionsList) {
        this.questionsList = questionsList;
    }

    public void readQuestion(int questionNumber) throws InterruptedException {
        synchronized (questionsList) {
            while (questionsList.size() == LIMIT) {
                System.out.println("Wait for answers firstly");
                questionsList.wait();
            }
        }
        synchronized (questionsList) {
            System.out.println("New questions: " + questionNumber);
            questionsList.add(questionNumber);
            Thread.sleep(100);
            questionsList.notify();
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                readQuestion(questionNumber++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
