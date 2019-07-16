package com.stackroute.PE4;

public class TransposeWords {

    //this function is used to reverse the string
    public String reverseString(String string)
    {
        String reverseString;

        if(string==""){
            return "Empty strings are not allowed!";
        }

        reverseString = "";
        String[] words = string.split(" "); //splits the input string into a string array of words
        for (int i = 0; i < words.length; i++)
        {
            reverseString += reverseWord(words[i] + " "); //reverses each element of the string array
        }
        return reverseString.trim(); //returns the reversed string
    }

    //this function reverses each word in the string
    public String reverseWord(String word)
    {
        String reverseWord = "";
        for (int i = word.length() - 1; i >= 0; i--) //this loop reverses the input string
        {
            reverseWord += word.charAt(i);
        }
        return reverseWord;
    }


}
