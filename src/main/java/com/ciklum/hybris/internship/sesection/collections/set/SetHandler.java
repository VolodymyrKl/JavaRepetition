package com.ciklum.hybris.internship.sesection.collections.set;

import com.ciklum.hybris.internship.sesection.collections.models.Animal;
import com.ciklum.hybris.internship.sesection.logging.LogHandler;

import java.util.HashSet;
import java.util.logging.Logger;

public class SetHandler {
    static Logger logger = LogHandler.implementLogger();

    public static void main(String[] args) {
        logger.info("Print HashSet");
        HashSet<Integer> values = new HashSet<>();
        values.add(12);
        values.add(34);
        values.add(5);
        values.add(42);
        for (Integer value : values) {
            System.out.println(value);
        }
        HashSet<Animal> animals = new HashSet<>();
        Animal animal1 = new Animal("Cat", 2);
        Animal animal2 = new Animal("Dog", 12);
        Animal animal3 = new Animal("Bird", 3);
        Animal animal4 = new Animal("Dog", 12);
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(animal4);
        for (Animal value : animals) {
            System.out.println(value);
        }
    }
}
