package com.ekaterinadubinina.exercise.two.String;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepeatEndTest {

    ///GIVEN
    RepeatEnd repeatStringEnd = new RepeatEnd();

    @Test
    public void shouldReturnRepeatStringEndFirst() {

///WHEN
        String actual = repeatStringEnd.repeatEnd("Hello", 3);

///THEN
        String expected = "llollollo";
        assertEquals(expected, actual);

    }

    @Test
    public void shouldReturnRepeatStringEndSecond() {

///WHEN
        String actual = repeatStringEnd.repeatEnd("1234", 2);

///THEN
        String expected = "3434";
        assertEquals(expected, actual);

    }

    @Test
    public void shouldReturnStringEndThirt() {

///WHEN
        String actual = repeatStringEnd.repeatEnd("", 0);

///THEN
        String expected = "";
        assertEquals(expected, actual);

    }


}

