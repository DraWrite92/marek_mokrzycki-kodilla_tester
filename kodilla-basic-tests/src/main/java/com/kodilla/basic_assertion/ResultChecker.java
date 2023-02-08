package com.kodilla.basic_assertion;

import java.math.BigDecimal;

public class ResultChecker {

    // The delta is not correctly implemented in this class; use JUnit tests instead.

    public static BigDecimal decDelta(double delta) {
        return BigDecimal.valueOf(delta);
    }

    public static boolean assertEquals(int expected, int actual) {
        return expected == actual;
    }
    public static boolean assertEquals(double expected, double actual, double delta) {
        return expected == actual;
    }
}
