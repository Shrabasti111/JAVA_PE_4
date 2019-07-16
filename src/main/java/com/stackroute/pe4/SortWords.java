package com.stackroute.PE4;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;
public class SortWords {

    //this function returns an array of the sorted words
    public String[] sortWordsInString(String inputString) {

        inputString = inputString.toLowerCase(); //converts the string to lowercase

        String[] words = inputString.split(" "); //splits the input string and stores it in a string array

        Arrays.sort(words); //sorts the words in the array

        return words; //returns the sorted array of words

    }

}
