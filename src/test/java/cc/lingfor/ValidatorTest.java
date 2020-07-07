package cc.lingfor;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;
import static org.junit.Assert.assertTrue;
import static org.mockito.BDDMockito.given;

import org.junit.Before;
import org.junit.Test;

public class ValidatorTest {
    @Before
    public void setUp() {
    }

    @Test
    public void shouldReturnTrueWithZero() {
        //when
        boolean result = Validator.isInteger("0");

        //then
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueWithPostiveValue() {
        //when
        boolean result = Validator.isInteger("1");

        //then
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueWithNegativeValue() {
        //when
        boolean result = Validator.isInteger("-1");

        //then
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseWithFloatingNumber() {
        //when
        boolean result = Validator.isInteger("1.23");

        //then
        assertTrue(!result);
    }

    @Test
    public void shouldReturnFalseWithEnglishAlphabet() {
        //when
        boolean result = Validator.isInteger("abc");

        //then
        assertTrue(!result);
    }

    @Test
    public void shouldReturnFalseWithEnglishAlphabetMixNumber() {
        //when
        boolean result = Validator.isInteger("12abc");

        //then
        assertTrue(!result);
    }

    @Test
    public void shouldReturnFalseWithSpecialCharacters() {
        //when
        boolean result = Validator.isInteger("%$@#$");

        //then
        assertTrue(!result);
    }


    // @Test
    // public void shouldReturnFalseWithLeadingZero() {
    //     //when
    //     boolean result = Validator.isInteger("01");

    //     //then
    //     assertTrue(!result);
    // }
}