package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateThatTestSuite {
    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        double a = 5.6;
        double b = 5.8;
        double subtractResult = calculator.numberSubtraction(a, b);
        assertEquals(-0.2, subtractResult, 0.00000001);
    }

    @Test
    public void testPositiveSquare() {
        Calculator calculatorPS = new Calculator();
        double a = 5;
        double positiveSqResult = calculatorPS.numberSquared(a);
        assertEquals(25, positiveSqResult, 0.00000001);
    }

    @Test
    public void testZeroSquare() {
        Calculator calculatorZS = new Calculator();
        double d = 0;
        double zeroSqResult = calculatorZS.numberZeroSquared(d);
        assertEquals(0, zeroSqResult, 0.00000001);
    }

    @Test
    public void testNegativeSquare() {
        Calculator calculatorNS = new Calculator();
        double c = -1;
        double negativeSqResult = calculatorNS.numberNegativeSquared(c);
        assertEquals(1, negativeSqResult, 0.00000001);
    }
}
