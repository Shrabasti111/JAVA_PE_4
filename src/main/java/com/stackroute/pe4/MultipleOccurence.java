package com.stackroute.PE4;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class MultipleOccurence {

     //this function returns the indices where the given substring occurs
       public String[] stringOccurence(String inputString, String subString) {

           inputString = inputString.toLowerCase();

           subString = subString.toLowerCase();

           Pattern pattern = Pattern.compile(subString); //substring is passed onto the pattern object

           Matcher matcher = pattern.matcher(inputString); //input string is passed onto the matcher object

           int count = ( inputString.split(subString, -1).length ) - 1; //counts the number of times the substring appears in the input string

           String[] result = new String[count];

           int i = 0;
           while(matcher.find()) { //whenever the substring is found in the input string, add it to the result array

               result[i] = String.valueOf(matcher.start())+" - "+String.valueOf(matcher.end());
               i++;

           }

           return  result; //return the result array
       }

}
