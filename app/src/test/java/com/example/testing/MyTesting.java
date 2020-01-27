package com.example.testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MyTesting {

    Arithmetic arithmetic = null;
    @Before
    public void Setup()
    {
        arithmetic = new Arithmetic();
    }

    @Test
    public void testAddition()
    {
        Arithmetic arithmetic = new Arithmetic();
        float expectedResult = 10;
        float actualResult = arithmetic.add(4,6);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testSubtraction()
    {
        Arithmetic arithmetic = new Arithmetic();
        float expectedResult = 2;
        float actualResult = arithmetic.subtract(4,2);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testDivision()
    {
        Arithmetic arithmetic = new Arithmetic();
        float expectedResult = 2;
        float actualResult = arithmetic.divide(10,5);
        assertEquals(expectedResult,actualResult);
    }

    @After
    public void tearDown()
    {
        arithmetic = null;
    }

}
