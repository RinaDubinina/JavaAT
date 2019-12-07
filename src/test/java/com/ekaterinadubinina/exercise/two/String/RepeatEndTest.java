package com.ekaterinadubinina.exercise.two.String;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepeatEndTest {

    ///GIVEN
    private RepeatEnd repeatStringEnd = new RepeatEnd();

    @Test
    public void shouldReturnRepeatLastCharactersOfStringFirstCase() {

        ///WHEN
        String actual = repeatStringEnd.repeatEnd("Hello", 3);

        ///THEN
        String expected = "llollollo";
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnRepeatLastCharactersOfStringSecondCase() {

        ///WHEN
        String actual = repeatStringEnd.repeatEnd("1234", 2);

        ///THEN
        String expected = "3434";
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnRepeatLastCharactersOfStringThirdCase() {

        ///WHEN
        String actual = repeatStringEnd.repeatEnd("", 0);

        ///THEN
        String expected = "";
        assertEquals(expected, actual);
    }

    @Test (expected = NullPointerException.class)
    public void shouldReturnThrowExceptionWhenStringNull () {

        ///WHEN
        String actual = repeatStringEnd.repeatEnd(null, 1);
    }

}

