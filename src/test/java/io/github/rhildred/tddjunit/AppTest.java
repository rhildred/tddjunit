package io.github.rhildred.tddjunit;

import java.math.*;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    public void testNew()
    {
        assertTrue( null != new HSTCalculate() );
    }

    public void testHSTCalculateON()
    {
        BigDecimal nStartAmount = BigDecimal.valueOf(10);
        assertTrue(HSTCalculate.calculate(nStartAmount, "ON").compareTo(new BigDecimal("11.3")) == 0);

    }
    public void testHSTCalculateBC()
    {
        BigDecimal nStartAmount = BigDecimal.valueOf(10);
        assertTrue(HSTCalculate.calculate(nStartAmount, "BC").compareTo(new BigDecimal("11.2")) == 0);

    }
    public void testHSTCalculateAB()
    {
        BigDecimal nStartAmount = BigDecimal.valueOf(10);
        assertTrue(HSTCalculate.calculate(nStartAmount, "AB").compareTo(new BigDecimal("10.5")) == 0);

    }
    public void testHSTCalculateNB()
    {
        BigDecimal nStartAmount = BigDecimal.valueOf(10);
        assertTrue(HSTCalculate.calculate(nStartAmount, "NB").compareTo(new BigDecimal("11.3")) == 0);

    }
    public void testHSTCalculateMB()
    {
        BigDecimal nStartAmount = BigDecimal.valueOf(10);
        assertTrue(HSTCalculate.calculate(nStartAmount, "MB").compareTo(new BigDecimal("11.3")) == 0);

    }
    public void testHSTCalculateNL()
    {
        BigDecimal nStartAmount = BigDecimal.valueOf(10);
        assertTrue(HSTCalculate.calculate(nStartAmount, "NL").compareTo(new BigDecimal("11.3")) == 0);

    }
    public void testHSTCalculateNT()
    {
        BigDecimal nStartAmount = BigDecimal.valueOf(10);
        assertTrue(HSTCalculate.calculate(nStartAmount, "NT").compareTo(new BigDecimal("10.5")) == 0);

    }
    public void testHSTCalculateNS()
    {
        BigDecimal nStartAmount = BigDecimal.valueOf(10);
        assertTrue(HSTCalculate.calculate(nStartAmount, "NS").compareTo(new BigDecimal("11.5")) == 0);

    }
    public void testHSTCalculateNU()
    {
        BigDecimal nStartAmount = BigDecimal.valueOf(10);
        assertTrue(HSTCalculate.calculate(nStartAmount, "NU").compareTo(new BigDecimal("10.5")) == 0);

    }
    public void testHSTCalculatePE()
    {
        BigDecimal nStartAmount = BigDecimal.valueOf(10);
        assertTrue(HSTCalculate.calculate(nStartAmount, "PE").compareTo(new BigDecimal("11.4")) == 0);

    }
    public void testHSTCalculateQC()
    {
        BigDecimal nStartAmount = BigDecimal.valueOf(10);
        assertTrue(HSTCalculate.calculate(nStartAmount, "QC").compareTo(new BigDecimal("11.4975")) == 0);

    }
    public void testHSTCalculateNoProvince()
    {
        BigDecimal nStartAmount = BigDecimal.valueOf(10);
        assertTrue(HSTCalculate.calculate(nStartAmount, "").compareTo(new BigDecimal("20")) == 0);

    }

}
