package com.stackroute.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberInitializationTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void display() {
        MemberInitialization object=new MemberInitialization();
        String[] expected=new String[3];
        expected[0]="john";
        expected[1]="30";
        expected[2]="203.9";
         int ex=0;
         String[] ac=new String[3];

         ac=object.intialization("john",34,207.5);

             if(((expected[0]).equals(ac[0]))&&((expected[1]).equals(ac[1]))&&((expected[3]).equals(ac[3]))){

                 ex=1;

             }
             assertEquals(1,ex);
         }

    }
