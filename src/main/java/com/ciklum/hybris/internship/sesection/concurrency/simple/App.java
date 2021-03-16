package com.ciklum.hybris.internship.sesection.concurrency.simple;

import com.ciklum.hybris.internship.sesection.logging.LogHandler;

import java.util.logging.Logger;

public class App {
    static Logger logger = LogHandler.implementLogger();

    public static void main(String[] args) {
        logger.info("Print result of simple thread working");
        new SimpleThread().handleThread();
    }
}
