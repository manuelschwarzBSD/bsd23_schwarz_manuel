/*
Author: Manuel Schwarz
Usage: Calculator
Last Change: 16.05.24
 */
package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    static Logger logger = LogManager.getLogger();

    public static double add(double a, double b) {
        logger.debug(a + "," + b);
        return a + b;
    }

    public static double minus(double a, double b) {
        logger.debug(a + "," + b);
        return a - b;
    }

    public static double divide(double a, double b) {
        if (b == 0){
            logger.error("Divide by zero");
            throw new ArithmeticException("Divide by zero");
        }
        return a / b;
    }

    public static double multiply(double a, double b) {
        logger.debug(a + "," + b);
        return a * b;
    }

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
