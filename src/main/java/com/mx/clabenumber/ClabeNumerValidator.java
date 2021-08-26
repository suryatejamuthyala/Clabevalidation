package com.mx.clabenumber;

import java.util.stream.Stream;

public class ClabeNumerValidator {
    public static void main(String[] args) {
        //  boolean flag=ClabeNumerValidator.isClabeNumValid("072045004722929298");//072058004722929296
        //  System.out.println("Result:"+flag);
    }

    public boolean isClabeNumValid(String clabe) {

        boolean result = false;
        String[] clabeAsStringArray = clabe.split("(?!^)");

        int[] clabeAsIntArray = Stream.of(clabeAsStringArray).mapToInt(Integer::parseInt).toArray();


        int sumofproducts = 0;
        for (int index = 0; index < clabeAsIntArray.length; index++) {
            if (index % 3 == 0) {
                clabeAsIntArray[index] = clabeAsIntArray[index] * 3;
                sumofproducts += clabeAsIntArray[index] % 10;
            } else if (index % 3 == 1) {
                clabeAsIntArray[index] = clabeAsIntArray[index] * 7;
                sumofproducts += clabeAsIntArray[index] % 10;
            } else if (index != 17) {
                clabeAsIntArray[index] = clabeAsIntArray[index];
                sumofproducts += clabeAsIntArray[index] % 10;
            }
        }
        int sumMod = sumofproducts % 10;
        int controlDigit = (10 - sumMod) % 10;

        System.out.println("controldigit:" + controlDigit);
        result = clabeAsIntArray[17] == controlDigit;
        return result;

    }
}
