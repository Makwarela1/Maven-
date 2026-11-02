package org.example;

import junit.framework.TestCase;
import org.junit.Test;

public class CalculatorTest extends TestCase {


    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.add(10, 2));
    }

    public void

}