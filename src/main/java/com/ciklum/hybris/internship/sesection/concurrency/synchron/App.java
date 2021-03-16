package com.ciklum.hybris.internship.sesection.concurrency.synchron;

import com.ciklum.hybris.internship.sesection.logging.LogHandler;

import java.util.logging.Logger;

public class App {
    static Logger logger = LogHandler.implementLogger();

    public static void main(String[] args) {
        logger.info("Print result of using a synchronized approach");
        new SynchronizeHandler().handleSynchronize();
    }
}
