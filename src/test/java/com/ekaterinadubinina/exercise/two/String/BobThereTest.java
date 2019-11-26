package com.ekaterinadubinina.exercise.two.String;

import org.junit.Test;

import java.util.regex.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BobThereTest {

    ///GIVEN
    BobThere bobThere = new BobThere();

    @Test
    public void shouldReturnBobThereFirst() {

        ///WHEN
        boolean actual = bobThere.bobThere("123abcbcdbabxyz");


        //THEN
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnBobThereSecond() {

        ///WHEN
        boolean actual = bobThere.bobThere("b12b1b");


        //THEN
        boolean expected = true;
        assertEquals(expected, actual);
    }


    @Test
    public void shouldReturnBobThereThird() {

        ///WHEN
        boolean actual = bobThere.bobThere("bbb");


        //THEN
        boolean expected = true;
        assertEquals(expected, actual);
    }
}
