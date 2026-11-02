package org.example;

import junit.framework.TestCase;
import org.junit.Test;

public class CalculatorTest extends TestCase {
    Calculator calculator = new Calculator();


    @Test
    public void testAdd(){
        assertEquals(12, calculator.add(10, 2));
    }

    public void testMultiply(){
        assertEquals(5, calculator.multiply(1,5));
    }

    public void testDivide(){
        assertEquals(5.0, calculator.divide(25.0,5.0));
    }

}