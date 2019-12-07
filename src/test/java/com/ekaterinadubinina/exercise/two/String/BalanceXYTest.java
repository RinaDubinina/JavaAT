package com.ekaterinadubinina.exercise.two.String;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BalanceXYTest {

    ///GIVEN
    private BalanceXY xyBalance = new BalanceXY();

    @Test
    public void shouldReturnTrueIfAfterXExistYFirstCase() {
        ///WHEN
        boolean actual = xyBalance.xyBalance("aaxbby");

        ///THEN
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTrueIfAfterXExistYSecondCase() {
        ///WHEN
        boolean actual = xyBalance.xyBalance("12xabxxydxyxyzz");

        ///THEN
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTrueIfAfterXExistYThirdCase() {
        ///WHEN
        boolean actual = xyBalance.xyBalance("");

        ///THEN
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void shouldReturnThrowExceptionWhenStringNull() {
        ///WHEN
        boolean actual = xyBalance.xyBalance(null);
    }
}
