package com.stackroute.PE4;

public class Replace {

      //this function replaces certain specific characters
      public String replaceCharacters(String inputString) {
          if(inputString==""){ //if the input string is empty, return null
              return null;
          }
          String outputString = inputString.toLowerCase(); //converts the input string into lower case
          outputString = outputString.replaceAll("d","f"); //replaces character 'd' with 'f'
          outputString = outputString.replaceAll("l","t"); //replaces character 'l' with 't'
          return outputString; // returns the output
      }

}
