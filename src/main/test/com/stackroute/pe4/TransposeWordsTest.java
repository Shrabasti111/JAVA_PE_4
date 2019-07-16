package com.stackroute.PE4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeWordsTest {
    TransposeWords transposeWords;

    @Before
    public void setUp()
    {
        transposeWords=new TransposeWords();
    }

    @After
    public void tearDown()
    {
        transposeWords=null;
    }
    @Test
    public void givenStringReturnTranspose()  //checks whether the expected result matches the actual result
    {
        String result=transposeWords.reverseString("a quick brown fox jumps over the lazy dog");
        assertEquals(result,"a kciuq nworb xof spmuj revo eht yzal god");
    }

    @Test
    public void givenEmptyStirng() //checks whether the expected result matches the actual result
    {
        String result=transposeWords.reverseString("");
        assertEquals(result,"Empty strings are not allowed!");
    }

    @Test(expected = NullPointerException.class) //checks for exception
    public void givenNullShouldRaiseException()
    {
        String  result=transposeWords.reverseString(null);
    }
}