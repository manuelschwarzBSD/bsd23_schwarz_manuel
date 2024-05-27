package at.campus02.bsd;

import org.junit.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @BeforeAll
    public static void setUp() {
    }

    @DisplayName("Testing add() method")
    @Test
    public void testAdd1() {
        assertEquals(5, Calculator.add(2,3));
    }

    @DisplayName("Testing add() method")
    @Test
    public void testAdd2() {
        assertEquals(8, Calculator.add(10,-2));
    }

    @DisplayName("Testing add() method")
    @Test
    public void testAdd3() {
        assertEquals(3, Calculator.add(3,0));
    }

    @DisplayName("Testing minus() method")
    @Test
    public void testMinus1() {
        assertEquals(5, Calculator.minus(8,3));
    }

    @DisplayName("Testing minus() method")
    @Test
    public void testMinus2() {
        assertEquals(-5, Calculator.minus(5,10));
    }

    @DisplayName("Testing minus() method")
    @Test
    public void testMinus3() {
        assertEquals(2, Calculator.minus(2,0));
    }

    @DisplayName("Testing divide() method")
    @Test
    public void testDivide1() {
        assertEquals(5, Calculator.divide(10,2));
    }

    @DisplayName("Testing divide() method")
    @Test
    public void testDivide2() {
        assertEquals(0.5, Calculator.divide(2,4));
    }

    @DisplayName("Testing divide() method by zero")
    @Test
    public void testDivide3() {
        Assert.assertThrows(ArithmeticException.class, () -> Calculator.divide(1, 0));
    }


    @DisplayName("Testing multiply() method")
    @Test
    public void testMultiply1() {
        assertEquals(10, Calculator.multiply(5,2));
    }

    @DisplayName("Testing multiply() method")
    @Test
    public void testMultiply2() {
        assertEquals(-10, Calculator.multiply(5,-2));
    }

    @DisplayName("Testing multiply() method")
    @Test
    public void testMultiply3() {
        assertEquals(0, Calculator.multiply(4,0));
    }

    @DisplayName("Testing factorial() method")
    @Test
    public void testFactorial1() {
        assertEquals(1, Calculator.factorial(0));
    }

    @DisplayName("Testing factorial() method")
    @Test
    public void testFactorial2() {
        assertEquals(1, Calculator.factorial(1));
    }

    @DisplayName("Testing factorial() method")
    @Test
    public void testFactorial3() {
        assertEquals(0, Calculator.factorial(-2));
    }

    @DisplayName("Testing factorial() method")
    @Test
    public void testFactorial4() {
        assertEquals(120, Calculator.factorial(5));
    }
}
