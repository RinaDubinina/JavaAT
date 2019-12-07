package com.ekaterinadubinina.exercise.two.String;

import org.junit.Test;

import java.util.regex.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BobThereTest {

    ///GIVEN
    private BobThere bobThere = new BobThere();

    @Test
    public void shouldReturnTrueIfBobThereFirstCase() {

        ///WHEN
        boolean actual = bobThere.bobThere("123abcbcdbabxyz");

        //THEN
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTrueIfBobThereSecondCase() {

        ///WHEN
        boolean actual = bobThere.bobThere("b12b1b");

        //THEN
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTrueIfBobThereThirdCase() {

        ///WHEN
        boolean actual = bobThere.bobThere("bbb");

        //THEN
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void shouldReturnThrowExeptionWhenStringNull() {

        ///WHEN
        boolean actual = bobThere.bobThere(null);
    }
}
