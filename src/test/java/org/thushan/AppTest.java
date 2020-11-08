package org.thushan;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    public static void main(String[] args) {
//        Result result = JUnitCore.runClasses(TestCalculator.class);
        Result result = JUnitCore.runClasses(Assert.class);
        for (Failure failure: result.getFailures())
        {
            System.out.println(failure.toString());
        }
        System.out.println("Result=="+result.wasSuccessful());
    }

}
