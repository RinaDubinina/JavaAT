package com.ekaterinadubinina.exercise.two.String;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NameTest {

    ///GIVEN
    private Name name = new Name();

    @Test
    public void shouldReturnHelloName() {

        ///WHEN
        String actual = name.helloName("Bob");

        ///THEN
        String expected1 = "Hello Bob!";
        assertEquals(expected1, actual);
    }

    @Test
    public void shouldReturnOnlyHelloIfNameIsEmpty() {
        ///WHEN
        String actual = name.helloName("");
        ///THEN
        String expected2 = "Hello !";
        assertEquals(expected2, actual);
    }

    @Test
    public void shouldReturnHelloNameIfStringContainsSeveralWords() {

        ///WHEN
        String actual = name.helloName("ho ho ho");
        ///THEN
        String expected3 = "Hello ho ho ho!";
        assertEquals(expected3, actual);

    }

    @Test (expected = NullPointerException.class)
    public void shouldReturnThrowExceptionWhenStringNull () {

        ///WHEN
        String actual = name.helloName(null);
    }

}
