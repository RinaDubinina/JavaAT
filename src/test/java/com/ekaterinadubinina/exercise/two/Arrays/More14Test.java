package com.ekaterinadubinina.exercise.two.Arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class More14Test {
    ///GIVEN
    private More14 more14 = new More14();

    @Test
    public void shouldReturnTrueIfNumFirstGreaterThenFourthFirstCase() {

        ///WHEN
        int[] nums = {1, 4, 1};

        ///THEN
        boolean actual = more14.more14(nums);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTrueIfNumFirstGreaterThenFourthSecondCase() {

        ///WHEN
        int[] nums = {1, 4, 1, 4, 1, 6};

        ///THEN
        boolean actual = more14.more14(nums);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTrueIfNumFirstGreaterThenFourthThirdCase() {

        ///WHEN
        int[] nums = {1, 1};

        ///THEN
        boolean actual = more14.more14(nums);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalseIfArrayIsEmpty() {

        ///WHEN
        int[] nums = {};

        ///THEN
        boolean actual = more14.more14(nums);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void shouldReturnThrowExceptionWhenArrayIsNull() {

        ///WHEN
        int[] nums = null;

        ///THEN
        boolean actual = more14.more14(nums);
    }
}
