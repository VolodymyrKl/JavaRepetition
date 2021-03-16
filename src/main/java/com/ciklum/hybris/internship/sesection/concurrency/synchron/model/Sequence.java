package com.ciklum.hybris.internship.sesection.concurrency.synchron.model;

public class Sequence {
    private int value = 0;

    public synchronized int getNext() {
        value++;
        return value;
    }
}
