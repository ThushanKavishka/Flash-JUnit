package org.thushan;

import org.junit.Test;
import static org.junit.Assert.*;

public class Assert {

    @Test
    public void testAssertion() {
        String str = new String("edu");
        String str1 = new String("edu");
        String str2 = null;
        String str3 = "edu";
        String str4 = "edu";
        int val = 5;
        int val1 = 6;
        String[] expectedArray = {"one, two", "three"};
        String[] resultArray = {"one, two", "three"};

        assertEquals(str, str1);

        assertTrue(val<val1);
        assertFalse(val>val1);

        assertNotNull(str);
        assertNull(str2);

        //check if the reference is to the same obj
        assertSame(str3, str4);
        assertNotSame(str3, str4);

        assertArrayEquals(expectedArray, resultArray);
    }
}
