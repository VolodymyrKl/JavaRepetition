package com.ciklum.hybris.internship.sesection.concurrency.producerconsumer.simple;

import com.ciklum.hybris.internship.sesection.logging.LogHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class App {
    static Logger logger = LogHandler.implementLogger();

    public static void main(String[] args) {
        logger.info("Print result of a simple implementing producer-consumer pattern ");
        List<Integer> questionList = new ArrayList<>();
        new Thread(new Producer(questionList)).start();
        new Thread(new Consumer(questionList)).start();
    }
}
