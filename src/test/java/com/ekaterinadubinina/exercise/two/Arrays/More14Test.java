package com.ekaterinadubinina.exercise.two.Arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class More14Test {
    ///GIVEN
    More14 more14 = new More14();

    @Test
    public void shouldReturnMore14First() {

        ///WHEN
        int[] nums = {1, 4, 1};


        ///THEN
        boolean actual = more14.more14(nums);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMore14Second() {

        ///WHEN
        int[] nums = {1, 4, 1, 4, 1, 6};


        ///THEN
        boolean actual = more14.more14(nums);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMore14Third() {

        ///WHEN
        int[] nums = {1, 1};


        ///THEN
        boolean actual = more14.more14(nums);
        boolean expected = true;
        assertEquals(expected, actual);
    }
}
