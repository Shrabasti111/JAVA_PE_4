package com.stackroute.PE4;
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
    public void inputStringCharacterReturnsCount() { //checks whether the given characters occurs for the expected number of times in the inputString
        String inputString = "I am a human";
        char character = 'a';
        int result = occurence.countOccurence(inputString,character,0,0);
        assertEquals(3,result);
    }

    @Test
    public void inputStringCharacterReturnNotFound() { //checks whether the given characters occurs for the expected number of times in the inputString
        int result = occurence.countOccurence("I am a human",'g',0,0);
        assertEquals(0,result);
    }

    @Test
    public void inputStringCharacterReturnCount1() { //checks whether the given characters does not occur for the expected number of times in the inputString
        int result = occurence.countOccurence("Hello there!",'h',0,0);
        assertNotEquals(1,result);
    }


    @Test
    public void inputNumericStringCharacterReturnCount1() { //checks whether the given characters does not occur for the expected number of times in the inputString
        int result = occurence.countOccurence("12343",'3',0,0);
        assertEquals(2,result);
    }


    @Test
    public void inputString3CharacterReturnCount1() { //checks whether the given characters does not occur for the expected number of times in the inputString
        int result = occurence.countOccurence("Hello@%@Hi",'@',0,0);
        assertEquals(2,result);
    }

    @Test(expected = NullPointerException.class) //checks for exception when input is null
    public void inputNullReturnException(){

        int result = occurence.countOccurence(null,'g',0,0);
    }

}