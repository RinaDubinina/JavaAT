package com.ekaterinadubinina.exercise.two.Arrays;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Reverse3Test {
    ///GIVEN
    private Reverse3 reverse3 = new Reverse3();

    @Test
    public void shouldReturnNewArrayWithReverseElementsFirstCase() {

        ///WHEN
        int[] nums = {1, 2, 3};

        ///THEN
        int[] actual = reverse3.reverse3(nums);
        int[] expected = {3, 2, 1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnNewArrayWithReverseElementsSecondCase() {

        ///WHEN
        int[] nums = {5, 11, 9};

        ///THEN
        int[] actual = reverse3.reverse3(nums);
        int[] expected = {9, 11, 5};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnNewArrayWithReverseElementsThirdCase() {

        ///WHEN
        int[] nums = {7, 0, 0};

        ///THEN
        int[] actual = reverse3.reverse3(nums);
        int[] expected = {0, 0, 7};
        assertArrayEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void shouldReturnThrowExceptionWhenArrayIsNull() {

        ///WHEN
        int[] nums = null;

        ///THEN
        int[] actual = reverse3.reverse3(nums);
    }
}
