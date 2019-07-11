package com.stackroute.pe4;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class RegularExpressionTest {

    RegularExpression regularExpression;

    @Before
    public void setUp() {
        regularExpression = new RegularExpression();
    }

    @After
    public void tearDown() {
        regularExpression = null;
    }

    @Test
    public void inputStringReturnsTrue() {  //checks whether the expected output matches the result
        String result = regularExpression.isHarryHere("This is Harry");
        assertEquals("Is Harry here ? true", result);
    }

    @Test
    public void inputAnotherStringReturnsTrue() {  //checks whether the expected output matches the result
        String result = regularExpression.isHarryHere("This is Henry");
        assertEquals("Is Harry here ? false", result);
    }

    @Test(expected = NullPointerException.class) //checks for exceptions
    public void inputNullRaisesExceptions() {
        String result = regularExpression.isHarryHere(null);
    }

}