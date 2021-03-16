package com.ciklum.hybris.internship.sesection.lambdastream.lambda;

import com.ciklum.hybris.internship.sesection.lambdastream.lambda.model.Car;
import com.ciklum.hybris.internship.sesection.logging.LogHandler;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.logging.Logger;

public class App {
    static Logger logger = LogHandler.implementLogger();

    public static void main(String[] args) {
        logger.info("Print result of using own functional interfaces and lambdas");
        operateFuncInterfaces();
        practiceLambda();
    }

    private static void practiceLambda() {
        List<Car> cars = Arrays.asList(
                new Car("Audi", "a8", "Red", 2000),
                new Car("BMW", "Great", "Black", 2444),
                new Car("Mercedes", "SLK", "White", 1234)
        );
        printCar(cars, car -> car.getColor().equals("Black"));
        Function<Car, String> priceAndColor = c -> "Price " + c.getPrice() + ", color " + c.getColor();
        System.out.println(priceAndColor.apply(cars.get(2)));
    }

    private static void printCar(List<Car> cars, Predicate<Car> condition) {
        for (Car car : cars) {
            if (condition.test(car)) {
                car.printCar();
            }
        }
    }

    private static void operateFuncInterfaces() {
        Walkable walkable = () -> System.out.println("Print something from function");
        walkable.walk();
        OperationsInterface<Integer> result = (k, v) -> k + v;
        System.out.println(result.operate(1, 3));
        OperationsInterface<Integer> operationsInterface = (a, b) -> {
            if (a == 0) {
                return 0;
            }
            return a / b;
        };
        System.out.println(operationsInterface.operate(20, 5));
        StringInterface reversed = r -> {
            String string = "";
            for (int i = r.length() - 1; i >= 0; i--) {
                string += r.charAt(i);
            }
            return string;
        };
        System.out.println(reversed.reverse("Morning"));
    }
}
