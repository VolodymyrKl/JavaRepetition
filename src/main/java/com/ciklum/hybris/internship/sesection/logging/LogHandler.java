package com.ciklum.hybris.internship.sesection.logging;

import java.util.logging.Logger;

public class LogHandler {
    private static Logger logger;

    public static Logger implementLogger() {
        logger = Logger.getLogger(LogHandler.class.getName());
        return logger;
    }
}
