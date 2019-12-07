package com.ekaterinadubinina.exercise.two.String;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComboStringTest {
    ///GIVEN
    private ComboString comboTwoString = new ComboString();

    @Test
    public void shouldReturnComboTwoStringFirstCase() throws Exception {

        ///WHEN
        String combo = comboTwoString.comboString("Hello", "hi");

        ///THEN
        String expected = "hiHellohi";
        assertEquals(expected, combo);
    }

    @Test
    public void shouldReturnComboTwoStringSecondCase() throws Exception {

        ///WHEN
        String combo = comboTwoString.comboString("", "bb");

        ///THEN
        String expected = "bb";
        assertEquals(expected, combo);
    }

    @Test
    public void shouldReturnComboTwoStringThirdCase() throws Exception {

        ///WHEN
        String combo = comboTwoString.comboString("aaa", "1234");

        ///THEN
        String expected = "aaa1234aaa";
        assertEquals(expected, combo);
    }

    @Test(expected = NullPointerException.class)
    public void shouldReturnThrowExceptionWhenStringNull() {

        ///WHEN
        String combo = comboTwoString.comboString(null, null);
    }
}