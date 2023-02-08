package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        // The delta is not reachable in this implementation; use JUnit tests instead.
        Calculator calculator = new Calculator();
        double a = 5.6;
        double b = 5.8;
        double c = -1;
        double d = 0;
        double sumResult = calculator.numberSum(a, b);
        boolean correct = ResultChecker.assertEquals(11.4, sumResult, 0.00000001);
        if (correct) {
            System.out.println("Metoda numberSum działa poprawnie dla liczb " + a + " i " + b + ".");
        } else {
            System.out.println("Metoda numberSum nie działa poprawnie dla liczb " + a + " i " + b + ".");
        }
        double subtractionResult = calculator.numberSubtraction(a, b);
        boolean ofCourse = ResultChecker.assertEquals(-0.2, subtractionResult, 0.00000001);
        if (ofCourse) {
            System.out.println("Metoda numberSubtraction działa poprawnie dla liczb " + a + " i " + b + ".");
        } else {
            System.out.println("Metoda numberSubtraction nie działa poprawnie dla liczb " + a + " i " + b + ".");
        }
        double squaringResult = calculator.numberSquared(a);
        boolean ohYes = ResultChecker.assertEquals(31.36, squaringResult, 0.00000001);
        if (ohYes) {
            System.out.println("Metoda numberSquared działa poprawnie dla liczby " + a + ".");
        } else {
            System.out.println("Metoda numberSquared nie działa poprawnie dla liczby " + a + ".");
        }

        double squareZero = calculator.numberZeroSquared(d);
        boolean expZero = ResultChecker.assertEquals(0, squareZero, 0.00000001);
        if (expZero) {
            System.out.println("Metoda numberZeroSquared działa poprawnie dla liczby " + d + ".");
        } else {
            System.out.println("Metoda numberZeroSquared nie działa poprawnie dla liczby " + d + ".");
        }

        double squareNegat = calculator.numberNegativeSquared(c);
        boolean correctNegative = ResultChecker.assertEquals(1, squareNegat, 0.00000001);
        if (correctNegative) {
            System.out.println("Metoda numberNegativeSquared działa poprawnie dla liczby " + c + ".");
        } else {
            System.out.println("Metoda numberNegativeSquared nie działa poprawnie dla liczby " + c + ".");
        }
    }
}
