package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.numberSum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda numberSum działa poprawnie dla liczb " + a + " i " + b + ".");
        } else {
            System.out.println("Metoda numberSum nie działa poprawnie dla liczb " + a + " i " + b + ".");
        }
        int subtractionResult = calculator.numberSubtraction(a, b);
        boolean ofCourse = ResultChecker.assertEquals(-3, subtractionResult);
        if (ofCourse) {
            System.out.println("Metoda numberSubtraction działa poprawnie dla liczb " + a + " i " + b + ".");
        } else {
            System.out.println("Metoda numberSubtraction nie działa poprawnie dla liczb " + a + " i " + b + ".");
        }
        int squaringResult = calculator.numberSquared(a);
        boolean ohYes = ResultChecker.assertEquals(25, squaringResult);
        if (ohYes) {
            System.out.println("Metoda numberSquared działa poprawnie dla liczby " + a + ".");
        } else {
            System.out.println("Metoda numberSquared nie działa poprawnie dla liczby " + a + ".");
        }
    }
}
