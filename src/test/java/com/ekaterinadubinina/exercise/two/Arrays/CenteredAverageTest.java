package com.ekaterinadubinina.exercise.two.Arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CenteredAverageTest {
    ///GIVEN
    CenteredAverage centeredAverage = new CenteredAverage();

    @Test
    public void shouldReturnCenteredAverageFirst() {

        ///WHEN
        int[] nums = {1, 1, 5, 5, 10, 8, 7};


        ///THEN
        int actual = centeredAverage.centeredAverage(nums);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCenteredAverageSecond() {

        ///WHEN
        int[] nums = {-10, -4, -2, -4, -2, 0};


        ///THEN
        int actual = centeredAverage.centeredAverage(nums);
        int expected = -3;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCenteredAverageThird() {

        ///WHEN
        int[] nums = {1000, 0, 1, 99};


        ///THEN
        int actual = centeredAverage.centeredAverage(nums);
        int expected = 50;
        assertEquals(expected, actual);
    }
}
