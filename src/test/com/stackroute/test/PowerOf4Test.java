package com.stackroute.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOf4Test {
    PowerOf4 obj;

    @Before
    public void setUp() throws Exception {
        obj=new PowerOf4();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void getPalindromeTestSuccess() {


        assertEquals("true", obj.getPower4(16));
        assertEquals("false", obj.getPower4(-11));
        assertEquals("false", obj.getPower4(0));
        assertEquals("true", obj.getPower4(256));

    }


}