package com.stackroute.PE4;
import java.util.regex.Pattern;
public class RegularExpression {

    boolean result;
    //this function checks whether substring is present in the inputString or not
     public String isHarryHere(String inputString) {

         boolean matches = Pattern.matches(".*Harry.*",inputString); //returns true if substring is found in the input string

         if (matches) //if substring is found, then return true, else return false
         {
             result = true;
         } else {
             result = false;
         }

         return "Is Harry here ? " + result; //returns the the result string

     }

}
