package com.ciklum.hybris.internship.sesection.collections.map;

import com.ciklum.hybris.internship.sesection.logging.LogHandler;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class MapHandler {
    static Logger logger = LogHandler.implementLogger();

    public static void main(String[] args) {
        logger.info("Print results of map");
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("Collect", "This is the...");
        dictionary.put("Brilliant", "This is a...");
        dictionary.put("Joy", "This is an...");
        dictionary.put("Joy", "This is changed...");
        for (Map.Entry<String, String> values : dictionary.entrySet()) {
            System.out.println(values.getKey() + " - " + values.getValue());
        }
    }
}
