package com.ekaterinadubinina.exercise.two.String;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BalanceXYTest {

    ///GIVEN
    private BalanceXY xyBalance = new BalanceXY();

    @Test
    public void shouldReturnTrueIfAfterXExistY() {
        ///WHEN
        boolean actual = xyBalance.xyBalance("aaxbby");

        ///THEN
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalseIfAfterXNotExistY() {
        ///WHEN
        boolean actual = xyBalance.xyBalance("12xabxxydxyxzz");

        ///THEN
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTrueIfStringIsEmpty() {
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
