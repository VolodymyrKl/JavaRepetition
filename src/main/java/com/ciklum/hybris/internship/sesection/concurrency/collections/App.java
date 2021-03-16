package com.ciklum.hybris.internship.sesection.concurrency.collections;

import com.ciklum.hybris.internship.sesection.logging.LogHandler;

import java.util.logging.Logger;

public class App {
    static Logger logger = LogHandler.implementLogger();

    public static void main(String[] args) throws InterruptedException {
        logger.info("Print result from running two threads ");
        InventoryManager inventoryManager = new InventoryManager();
        Thread inventory = new Thread(inventoryManager::populateSoldProducts);
        Thread display = new Thread(inventoryManager::displaySoldProducts);
        inventory.start();
        Thread.sleep(2000);
        display.start();
    }
}
