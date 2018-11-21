/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.rhildred.tddjunit;

import java.math.BigDecimal;
import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author 000382395
 */
public class HSTCalculateTest extends TestCase {
    
    public HSTCalculateTest(String testName) {
        super(testName);
    }
    @Test
    public void testCalculate() throws Exception {
        System.out.println("calculate");
        BigDecimal nIn = null;
        String sProv = "";
        BigDecimal expResult = null;
        BigDecimal result = HSTCalculate.calculate(nIn, sProv);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
