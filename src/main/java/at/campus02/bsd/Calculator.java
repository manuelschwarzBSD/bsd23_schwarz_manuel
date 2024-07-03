/*
Author: Manuel Schwarz
Usage: Calculator
Last Change: 03.07.24
 */
package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Calculator class that implements various methods for addition, subtraction,division and multiplication of two numbers.
 * Also implements a method to calculate the factorial of a number.
 * For logging purposes a LogManager was used in each method to print out the numbers worked with or error messages
 */
public class Calculator {

    /**
     * LogManager logger that is used throughout whole class to log various states of methods
     */
    static Logger logger = LogManager.getLogger();

    /**
     * adds two numbers and returns the result (sum) of the two numbers, works with doubles
     * order does not matter because it is irrelevant in addition
     * @param a double 1
     * @param b double 2
     * @return the sum of double 1 and double 2 as a double
     */
    public static double add(double a, double b) {
        logger.debug(a + "," + b);
        return a + b;
    }

    /**
     * subtracts double "b" from double "a" returns the result of this subtraction, works with doubles
     * order matters because it is always b that gets subtracted from a
     * @param a double from which is subtracted
     * @param b double that is subtracted from a
     * @return the result of b subtracted from a
     */
    public static double minus(double a, double b) {
        logger.debug(a + "," + b);
        return a - b;
    }

    /**
     * divides double a with double b
     * order matters because it is always a that gets divided by b
     * @param a double that gets divided
     * @param b double by which is being divided
     * @return result of the division a / b
     * @throws ArithmeticException if the divisor (b) is zero, because division by zero is impossible
     */
    public static double divide(double a, double b) {
        if (b == 0){
            logger.error("Divide by zero");
            throw new ArithmeticException("Divide by zero");
        }
        return a / b;
    }

    /**
     * multiplies two numbers with each other
     * order does not matter because it is irrelevant in multiplication
     * @param a double 1
     * @param b double 2
     * @return the result of the multiplication in form of a * b
     */
    public static double multiply(double a, double b) {
        logger.debug(a + "," + b);
        return a * b;
    }

    /**
     * method that calculates the factorial of an integer a
     * also considers edge cases like a = 0, a = 1 or a < 0
     * @param a integer value for which the factorial is calculated
     * @return factorial of int a
     */
    public static double factorial(int a) {
        logger.debug(a);
        double fact = a;
        if (a == 0 || a == 1) {
            fact = 1;
        }
        if (a < 0) {
            fact = 0;
        }
        for (int i = a - 1; i > 0; i--) {
            fact *= i;
        }
        return fact;
    }


}
