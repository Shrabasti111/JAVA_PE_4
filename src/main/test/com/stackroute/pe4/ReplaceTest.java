package com.stackroute.PE4;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class ReplaceTest {

    Replace replace;

    @Before
    public void setUp() {
        replace = new Replace();
    }

    @After
    public void tearDown() {
        replace = null;
    }

    @Test
    public void inputStringReturnReplacedString() { //checks whether the expected result matches the actual result
        String result = replace.replaceCharacters("daily dry");
        String expected = "faity fry";
        assertEquals(expected,result);
    }

    @Test(expected = NullPointerException.class) //checks for exception
    public void inputNullReturnException() {
        String result = replace.replaceCharacters(null);
    }

    @Test
    public void inputStringReturnNull(){ //checks whether the actual result is null or not
        String result = replace.replaceCharacters("");
        assertNull(result);
    }

}