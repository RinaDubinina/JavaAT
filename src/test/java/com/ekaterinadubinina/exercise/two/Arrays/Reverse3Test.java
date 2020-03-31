package com.ekaterinadubinina.exercise.two.Arrays;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Reverse3Test {
    ///GIVEN
    private Reverse3 reverse3 = new Reverse3();

    @Test
    public void shouldReturnNewArrayWithReverseElements() {

        ///WHEN
        int[] nums = {1, 2, 3};

        ///THEN
        int[] actual = reverse3.reverse3(nums);
        int[] expected = {3, 2, 1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnNewArrayWithReverseElementsOfArrayWithNegativeValues() {

        ///WHEN
        int[] nums = {-7, -1, -8};

        ///THEN
        int[] actual = reverse3.reverse3(nums);
        int[] expected = {-8, -1, -7};
        assertArrayEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void shouldReturnThrowExceptionWhenArrayNull() {

        ///WHEN
        int[] nums = null;

        ///THEN
        int[] actual = reverse3.reverse3(nums);
    }
}
