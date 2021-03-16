package com.ciklum.hybris.internship.sesection.collections.list;

import com.ciklum.hybris.internship.sesection.collections.models.Vehicle;
import com.ciklum.hybris.internship.sesection.logging.LogHandler;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

public class ListHandler {
    static Logger logger = LogHandler.implementLogger();

    public static void main(String[] args) {
        logger.info("Print list without generics");
        handleListWithoutGenerics();
        logger.info("Print list with generics");
        handleListWithGenerics();
        logger.info("Print list of vehicle");
        handleTraverseList();
    }
    public static void handleTraverseList() {
        List<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Cat");
        animals.add("Dog");
        printElements(animals);
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        Vehicle toyota = new Vehicle("Toyota", "Camry", 1000, false);
        vehicles.add(toyota);
        vehicles.add(new Vehicle("Jeep", "Wrangler", 2000, true));
        printElements(vehicles);
    }

    public static void handleListWithGenerics() {
        List<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("Hallo");
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(32);
        numbers.add(8);
        numbers.removeFirst();
        printElements(numbers);
    }

    public static void handleListWithoutGenerics() {
        List elements = new ArrayList();
        elements.add("Hello");
        elements.add(12);
        elements.add(123.39);
        elements.add('e');
        int first = (int) elements.get(1);
        double second = (double) elements.get(2);
        System.out.println("Result: " + first + second);
    }

    private static void printElements(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
