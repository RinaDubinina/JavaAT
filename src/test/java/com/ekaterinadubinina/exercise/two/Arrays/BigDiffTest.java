package com.ekaterinadubinina.exercise.two.Arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BigDiffTest {
    ///GIVEN
    BigDiff bigDiff = new BigDiff();

    @Test
    public void shouldReturnBigDiffFirs() {

        ///WHEN
        int[] nums = {10, 3, 5, 6};


        ///THEN
        int actual = bigDiff.bigDiff(nums);
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnBigDiffSecond() {

        ///WHEN
        int[] nums = {2, 2};


        ///THEN
        int actual = bigDiff.bigDiff(nums);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnBigDiffThird() {

        ///WHEN
        int[] nums = {7, 7, 6, 8, 5, 5, 6};


        ///THEN
        int actual = bigDiff.bigDiff(nums);
        int expected = 3;
        assertEquals(expected, actual);
    }
}
