package org.thushan;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCalculator{

    Calculater calculater = null;

    @Before
    public void setUp(){
        calculater = new Calculater();
    }

    @Test
    public void testAdd() {
            assertEquals(5, calculater.add(2, 3));
    }

    @After
    public void afterTest() {
        if (calculater != null) {
            calculater = null;
        }
    }

}
