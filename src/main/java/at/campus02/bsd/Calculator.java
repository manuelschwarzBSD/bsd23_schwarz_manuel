/*
Author: Manuel Schwarz
Usage: Calculator
Last Change: 16.05.24
 */
package at.campus02.bsd;

public class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double minus(double a, double b) {
        return a - b;
    }

    public static double divide(double a, double b) {
        if (b == 0){
            throw new ArithmeticException("Divide by zero");
        }
        return a / b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }


}
