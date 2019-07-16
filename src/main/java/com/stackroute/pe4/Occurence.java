package com.stackroute.PE4;

public class Occurence {

    //this function counts the number of times the given character occurs in the input string
    public int countOccurence(String inputString, char character, int index, int count){

        inputString = inputString.toLowerCase(); //converts the string into lowercase
        if (index < inputString.length()) {  //recursive function is called again and again as long as index does not exceed the length of the input string
            if (character == inputString.charAt(index)) {
                count++;
            }
            index++;
            count = countOccurence(inputString, character, index, count); //recursive call to the countOccurence() function
        }

        return count; //returns the number of times the given character occurs

    }


}
