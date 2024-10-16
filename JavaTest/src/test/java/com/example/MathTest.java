package com.example;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class MathTest {
    static Math m;

    @BeforeClass
    //run once before all test cases start running
    public static void setup(){
        m = new Math();
    }
    
    @Test
    public void canAdd() {
        assertEquals(3, m.add(1, 2));
    }

    @Test
    public void canSubstract() {
        assertEquals(1, m.substract(2, 1));
    }

    @Test
    public void canMultiply() {
        assertEquals(6, m.multiply(2, 3));
    }
    

    @Test
    public void canDivide() {
        assertEquals(2.0, m.divide(6, 3), 0.001);
    }

}