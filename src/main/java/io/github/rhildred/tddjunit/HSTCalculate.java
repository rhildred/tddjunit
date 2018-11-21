package io.github.rhildred.tddjunit;

import java.math.BigDecimal;

/**
 * Created by rhildred on 2016-02-28.
 */
public class HSTCalculate {
    public static BigDecimal calculate(BigDecimal nIn, String sProv){
        if(sProv.equals("BC")) {
            return (new BigDecimal("1.12").multiply(nIn));
        }else if(sProv.equals("AB") ||
                sProv.equals("NT") ||
                sProv.equals("NU")){
            return (new BigDecimal("1.05").multiply(nIn));
        }else if(sProv.equals("ON") ||
                sProv.equals("NB") ||
                sProv.equals("MB") ||
                sProv.equals("NL")){
            return (new BigDecimal("1.13").multiply(nIn));
        }else if(sProv.equals("NS")){
            return (new BigDecimal("1.15").multiply(nIn));
        }else if(sProv.equals("PE")) {
            return (new BigDecimal("1.14").multiply(nIn));
        }else if(sProv.equals("QC")){
            return (new BigDecimal("1.14975").multiply(nIn));
        }
        //100% tax
        return (new BigDecimal(2).multiply(nIn));
    }
}
