package com.gatto.tdd.course;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

    @Test(expected = ArithmeticException.class)
    public void testDivisionException() {
        Calculator c = new Calculator();
        int a = 5, b = 0;
        c.divide(a, b);
    }
    
    @Test
    public void testNegativeDivision() {
        Calculator c = new Calculator();
        int a = -10, b = -2;
        c.divide(a, b);
    }

    @Test
    public void testDivision() {
        Calculator c = new Calculator();
        int a = 10, b = 2;
        double result = c.divide(a, b);
        assertEquals(5.0, result, 0.0001);
    }

    @Test
    public void testSumTwoPositiveNumbers() {
        assertEquals(4, new Calculator().add(2, 2));
    }

    @Test
    public void testSumPositiveAndNegativeNumber() {
        assertEquals(4, new Calculator().add(6, -2));
    }

    @Test
    public void testSumNegativeAndPositiveNumber() {
        assertEquals(-4, new Calculator().add(-6, 2));
    }

    @Test
    public void testSumTwoNegativeNumbers() {
        assertEquals(-4, new Calculator().add(-2, -2));
    }

    @Test
    public void testSumsWithZero() {
        assertEquals(4, new Calculator().add(0, 4));
        assertEquals(4, new Calculator().add(4, 0));
    }

}
