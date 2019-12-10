package com.ekaterinadubinina.exercise.two.String;

import org.junit.Test;

import java.util.regex.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BobThereTest {

    ///GIVEN
    private BobThere bobThere = new BobThere();

    @Test
    public void shouldReturnTrueIfBobThere() {

        ///WHEN
        boolean actual = bobThere.bobThere("123abcbcdbabxyz");

        //THEN
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalseIfBobNotThere() {

        ///WHEN
        boolean actual = bobThere.bobThere("b12b1d");

        //THEN
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalseIfStringIsEmpty() {

        ///WHEN
        boolean actual = bobThere.bobThere("");

        //THEN
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void shouldReturnThrowExeptionWhenStringNull() {

        ///WHEN
        boolean actual = bobThere.bobThere(null);
    }
}
