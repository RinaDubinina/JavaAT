package com.ekaterinadubinina.exercise.two.String;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepeatEndTest {

    ///GIVEN
    private RepeatEnd repeatStringEnd = new RepeatEnd();

    @Test
    public void shouldReturnRepeatLastCharactersOfString() {

        ///WHEN
        String actual = repeatStringEnd.repeatEnd("Hello", 3);

        ///THEN
        String expected = "llollollo";
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnEmptyStringIfRepeatValueEqualZero() {

        ///WHEN
        String actual = repeatStringEnd.repeatEnd("1234", 0);

        ///THEN
        String expected = "";
        assertEquals(expected, actual);
    }

    @Test(expected = Exception.class)
    public void shouldReturnThrowExceptionIfOriginalStringIsEmptyAndRepeatValueNotEqualZero() {

        ///WHEN
        String actual = repeatStringEnd.repeatEnd("", 2);
    }

    @Test(expected = NullPointerException.class)
    public void shouldReturnThrowExceptionWhenStringNull() {

        ///WHEN
        String actual = repeatStringEnd.repeatEnd(null, 1);
    }

}

