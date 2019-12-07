package com.ekaterinadubinina.exercise.two.Arrays;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MiddleWayTest {
    ///GIVEN
    private MiddleWay middleWay = new MiddleWay();

    @Test
    public void shouldReturnMiddleTwoArraysFirstCase() {

        ///WHEN
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};

        ///THEN
        int[] actual = middleWay.middleWay(a, b);
        int[] expected = {2, 5};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnMiddleTwoArraysSecondCase() {

        ///WHEN
        int[] a = {5, 2, 9};
        int[] b = {1, 4, 5};

        ///THEN
        int[] actual = middleWay.middleWay(a, b);
        int[] expected = {2, 4};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnMiddleTwoArraysThirdCase() {

        ///WHEN
        int[] a = {5, 126, 33};
        int[] b = {40, 11, 15};

        ///THEN
        int[] actual = middleWay.middleWay(a, b);
        int[] expected = {126, 11};
        assertArrayEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void shouldReturnThrowExceptionIfOneArrayNull() {

        ///WHEN
        int[] a = null;
        int[] b = {40, 11, 15};

        ///THEN
        int[] actual = middleWay.middleWay(a, b);
    }
}
