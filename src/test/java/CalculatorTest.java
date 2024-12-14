import org.example.Calculator;
import org.example.Main;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSum() {
        assertEquals(4, Calculator.add(2, 2));
    }

    @Test
    public void testDifference() {
        assertEquals(4, Calculator.difference(6, 2));
    }

    @Test
    public void testMultiplication() {
        assertEquals(4, Calculator.multiplication(2, 2));
    }

    @Test
    public void testDivision() {
        assertEquals(4, Calculator.div(8, 2));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        Calculator.div(8, 0);
    }

    @Test
    public void testPower() {
        assertEquals(8, Calculator.power(2, 3));
    }

    @Test
    public void testSqrt() {
        assertEquals(4.0, Calculator.sqrt(16), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSqrtNegative() {
        Calculator.sqrt(-1);
    }

    @Test
    public void testAbs() {
        assertEquals(5, Calculator.abs(-5));
        assertEquals(5, Calculator.abs(5));
    }

    @Test
    public void testMain() {
        String[] args = new String[0];
        Main.main(args);
    }
}