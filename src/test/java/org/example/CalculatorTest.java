package org.example;

import junit.framework.TestCase;
import org.junit.Test;

public class CalculatorTest extends TestCase {


    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        assertEquals(12, calculator.add(10, 2));
    }

    public void testMultiply(){
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.multiply(1,5));
    }

}