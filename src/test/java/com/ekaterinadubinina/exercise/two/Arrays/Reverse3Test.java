package com.ekaterinadubinina.exercise.two.Arrays;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Reverse3Test {
    ///GIVEN
    Reverse3 reverse3 = new Reverse3();

    @Test
    public void shouldReturnReverse3First() {

        ///WHEN
        int[] nums = {1, 2, 3};

        ///THEN
        int[] actual = reverse3.reverse3(nums);
        int[] expected = {3, 2, 1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnReverse3Second() {

        ///WHEN
        int[] nums = {5, 11, 9};

        ///THEN
        int[] actual = reverse3.reverse3(nums);
        int[] expected = {9, 11, 5};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnReverse3Third() {

        ///WHEN
        int[] nums = {7, 0, 0};

        ///THEN
        int[] actual = reverse3.reverse3(nums);
        int[] expected = {0, 0, 7};
        assertArrayEquals(expected, actual);
    }
}
