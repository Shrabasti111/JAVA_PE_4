package com.stackroute.pe4;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class SortWordsTest {

    SortWords sortWords;

    @Before
    public void setUp() {
        sortWords = new SortWords();
    }

    @After
    public void tearDown() {
        sortWords = null;
    }

    @Test
    public void inputStringReturnSortedString(){ //checks whether the expected result matches the actual result
        String inputString = "Hello this is a human here";
        String[] expected = {"a","hello","here","human","is","this"};
        String[] result = sortWords.sortWordsInString(inputString);
        assertArrayEquals(expected, result);
    }

    @Test
    public void inputString1ReturnSortedString(){ //checks whether the expected result matches the actual result
        String inputString = "Welcome to this world of happiness";
        String[] expected = {"happiness","of","this","to","welcome","world"};
        String[] result = sortWords.sortWordsInString(inputString);
        assertArrayEquals(expected, result);
    }

    @Test(expected = NullPointerException.class) //checks for exception
    public void givenNullRaiseExceptions() {
        String[] result = sortWords.sortWordsInString(null);
    }

}