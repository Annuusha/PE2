package com.stackroute.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {
    EvenNumTest obj;

    @Before
    public void setUp() throws Exception {
        obj=new EvenNumTest();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isEven() {
        assertEquals("true",obj.isEven(2));
        assertEquals("false",obj.isEven(3));
    }
}