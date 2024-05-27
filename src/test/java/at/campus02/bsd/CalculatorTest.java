package at.campus02.bsd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @BeforeAll
    public static void setUp() {
        // No need to create an instance since methods are static
    }

    @DisplayName("Testing add() method")
    @Test
    public void testAdd1() {
        assertEquals(5, Calculator.add(2, 3));
    }

    @DisplayName("Testing add() method")
    @Test
    public void testAdd2() {
        assertEquals(10, Calculator.add(10, 0));
    }

    @DisplayName("Testing add() method")
    @Test
    public void testAdd3() {
        assertEquals(0, Calculator.add(0, 0));
    }

    @DisplayName("Testing minus() method")
    @Test
    public void testMinus1() {
        assertEquals(5, Calculator.minus(8, 3));
    }

    @DisplayName("Testing minus() method")
    @Test
    public void testMinus2() {
        assertEquals(5, Calculator.minus(5, 0));
    }

    @DisplayName("Testing minus() method")
    @Test
    public void testMinus3() {
        assertEquals(0, Calculator.minus(0, 0));
    }

    @DisplayName("Testing divide() method")
    @Test
    public void testDivide1() {
        assertEquals(5, Calculator.divide(10, 2));
    }

    @DisplayName("Testing divide() method")
    @Test
    public void testDivide2() {
        assertEquals(8, Calculator.divide(16, 2));
    }

    @DisplayName("Testing divide() method")
    @Test
    public void testDivide3() {
        assertEquals(100, Calculator.divide(100, 1));
    }

    @DisplayName("Testing divide() by zero")
    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> Calculator.divide(1, 0));
    }

    @DisplayName("Testing multiply() method")
    @Test
    public void testMultiply1() {
        assertEquals(10, Calculator.multiply(5, 2));
    }

    @DisplayName("Testing multiply() method")
    @Test
    public void testMultiply2() {
        assertEquals(0, Calculator.multiply(5, 0));
    }

    @DisplayName("Testing multiply() method")
    @Test
    public void testMultiply3() {
        assertEquals(0, Calculator.multiply(0, 0));
    }

    @DisplayName("Testing factorial() method")
    @org.junit.Test
    public void testFactorial1() {
        assertEquals(1, Calculator.factorial(0));
    }

    @DisplayName("Testing factorial() method")
    @org.junit.Test
    public void testFactorial2() {
        Assertions.assertEquals(1, Calculator.factorial(1));
    }

    @DisplayName("Testing factorial() method")
    @org.junit.Test
    public void testFactorial3() {
        assertEquals(0, Calculator.factorial(-2));
    }

    @DisplayName("Testing factorial() method")
    @org.junit.Test
    public void testFactorial4() {
        assertEquals(120, Calculator.factorial(5));
    }
}
