package com.ciklum.hybris.internship.sesection.concurrency.producerconsumer.simple;

import java.util.List;

public class Consumer implements Runnable {
    private List<Integer> questionsList;

    public Consumer(List<Integer> questionsList) {
        this.questionsList = questionsList;
    }

    public void answerQuestion() throws InterruptedException {
        synchronized (questionsList) {
            while (questionsList.isEmpty()) {
                System.out.println("No question");
                questionsList.wait();
            }
        }
        synchronized (questionsList) {
            Thread.sleep(5000);
            System.out.println("Answered questions: " + questionsList.remove(0));
            questionsList.notify();
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                answerQuestion();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
