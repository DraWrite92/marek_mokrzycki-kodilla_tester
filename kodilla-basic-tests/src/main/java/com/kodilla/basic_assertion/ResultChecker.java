package com.kodilla.basic_assertion;

public class ResultChecker {

    public static final double DELTA = 1e-15;
    public static boolean assertEquals(double expected, double actual, double delta) {
        return expected == actual;
    }
}
