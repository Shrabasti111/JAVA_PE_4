package com.stackroute.pe4;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class OccurenceTest {

    Occurence occurence;

    @Before
    public void setUp(){
        occurence = new Occurence();
    }

    @After
    public void tearDown() {
        occurence = null;
    }

    @Test
    public void inputStringAndCharacterCorrectlyReturnsCount() { //checks whether the given characters occurs for the expected number of times in the inputString
        String inputString = "I am a human";
        char character = 'a';
        int result = occurence.countOccurence(inputString,character,0,0);
        assertEquals(3,result);
    }

    @Test
    public void inputStringAndCharacterReturnsNotFound() { //checks whether the given characters occurs for the expected number of times in the inputString
        int result = occurence.countOccurence("I am a human",'g',0,0);
        assertEquals(0,result);
    }

    @Test
    public void inputStringAndCharacterReturnsOneAsCount() { //checks whether the given characters does not occur for the expected number of times in the inputString
        int result = occurence.countOccurence("Hello there!",'h',0,0);
        assertNotEquals(1,result);
    }

    @Test(expected = NullPointerException.class) //checks for exception when input is null
    public void inputNullReturnsException(){

        int result = occurence.countOccurence(null,'g',0,0);
    }

}