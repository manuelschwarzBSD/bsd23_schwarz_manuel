package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        double resultAdd = Calculator.add(1,1);
        double resultMinus = Calculator.minus(1,1);
        double resultDivide = Calculator.divide(4,2);
        double resultMultiply = Calculator.multiply(4,2);

        logger.info("info");
        logger.error("error");

        System.out.println("Manuel Schwarz");
    }
}
