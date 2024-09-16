package com.example;

import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(-2, 1));
        assertEquals(0, calculator.add(0, 0));
    }

    @Test
    void testSubtract() {
        assertEquals(1, calculator.subtract(5, 4));
        assertEquals(-3, calculator.subtract(-2, 1));
        assertEquals(0, calculator.subtract(0, 0));
    }

    @Test
    void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(-2, calculator.multiply(-1, 2));
        assertEquals(0, calculator.multiply(0, 5));
    }

    @Test
    void testDivide() {
        assertEquals(2, calculator.divide(6, 3));
        assertEquals(-2, calculator.divide(-6, 3));
        assertEquals(0, calculator.divide(0, 5));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0));
    }

    @Test
    void testDivideDouble() {
        assertEquals(2.5, calculator.divide(5.0, 2.0));
        assertEquals(-2.5, calculator.divide(-5.0, 2.0));
        assertEquals(0.0, calculator.divide(0.0, 2.0));
    }

    @Test
    void testSqrt() {
        assertEquals(2.0, calculator.sqrt(4.0));
        assertEquals(0.0, calculator.sqrt(0.0));
        assertEquals(3.0, calculator.sqrt(9.0));
        assertEquals(2.0, calculator.sqrt(4));
    }

    @Test
    void testSqrtNegative() {
        assertThrows(ArithmeticException.class, () -> calculator.sqrt(-4.0));
    }

    @Test
    void testPower() {
        assertEquals(8.0, calculator.power(2.0, 3.0));
        assertEquals(1.0, calculator.power(5.0, 0.0));
        assertEquals(0.25, calculator.power(2.0, -2.0));
        assertEquals(27, calculator.power(3, 3));
        assertEquals(1, calculator.power(5, 0));
        assertEquals(0.25, calculator.power(2, -2));
    }
}
