package com.ekaterinadubinina.exercise.two.String;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComboStringTest {
    ///GIVEN
    private ComboString comboTwoString = new ComboString();

    @Test
    public void shouldReturnComboTwoString() {

        ///WHEN
        String combo = comboTwoString.comboString("Hello", "hi");

        ///THEN
        String expected = "hiHellohi";
        assertEquals(expected, combo);
    }

    @Test
    public void shouldReturnComboTwoStringIfOneOfThewIsEmpty() {

        ///WHEN
        String combo = comboTwoString.comboString("", "bb");

        ///THEN
        String expected = "bb";
        assertEquals(expected, combo);
    }

    @Test
    public void shouldReturnEmptyStringIfTwoStringAreEmpty() {

        ///WHEN
        String combo = comboTwoString.comboString("", "");

        ///THEN
        String expected = "";
        assertEquals(expected, combo);
    }

    @Test(expected = NullPointerException.class)
    public void shouldReturnThrowExceptionWhenStringNull() {

        ///WHEN
        String combo = comboTwoString.comboString(null, null);
    }
}