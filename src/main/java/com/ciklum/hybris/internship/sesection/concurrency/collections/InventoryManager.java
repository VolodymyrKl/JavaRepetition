package com.ciklum.hybris.internship.sesection.concurrency.collections;

import com.ciklum.hybris.internship.sesection.concurrency.collections.model.Product;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {
    List<Product> soldProductsList = new CopyOnWriteArrayList<>();
    List<Product> purchasedProductsList = new CopyOnWriteArrayList<>();

    public void populateSoldProducts() {
        for (int i = 0; i < 100; i++) {
            Product product = new Product(i, "Test_product" + i);
            soldProductsList.add(product);
            System.out.println("Added: " + product);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void displaySoldProducts() {
        for (Product product : soldProductsList) {
            System.out.println("Printing sold: " + product);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
