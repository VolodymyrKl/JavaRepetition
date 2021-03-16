package com.ciklum.hybris.internship.sesection.collections.comparable;

import com.ciklum.hybris.internship.sesection.collections.models.Employee;
import com.ciklum.hybris.internship.sesection.logging.LogHandler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.logging.Logger;

public class ComparableHandler {
    static Logger logger = LogHandler.implementLogger();

    public static void main(String[] args) {
        logger.info("Print result from running Comparable interface");
        HashSet<Employee> hashSet = new HashSet<>();
        hashSet.add(new Employee("Paul", 2234, "Admin"));
        hashSet.add(new Employee("Mike", 234, "Accounting"));
        hashSet.add(new Employee("John", 1000, "I"));
        hashSet.add(new Employee("Angel", 1243, "Maint"));
        ArrayList<Employee> list = new ArrayList<>(hashSet);
        Collections.sort(list);
        System.out.println(list);
    }
}
