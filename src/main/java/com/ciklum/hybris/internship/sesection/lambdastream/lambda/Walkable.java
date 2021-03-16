package com.ciklum.hybris.internship.sesection.lambdastream.lambda;

@FunctionalInterface
public interface Walkable {
    void walk();
}

@FunctionalInterface
interface OperationsInterface<E> {
    E operate(E e1, E e2);
}
@FunctionalInterface
interface StringInterface {
    String reverse(String string);
}