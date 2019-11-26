package com.ekaterinadubinina.exercise.two.String;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class NameTest {

    ///GIVEN
    Name name = new Name();

    @Test
    public void shouldReturnHelloFirstName () throws Exception {

        ///WHEN
        String greeting1 = name.helloName("Bob");

        ///THEN
        String expected1 = "Hello Bob!";
        assertEquals(expected1, greeting1);
    }

    @Test
    public void shouldReturnHelloSecondName () throws Exception {
        ///WHEN
        String greeting2 = name.helloName("Alice");
        ///THEN
        String expected2 = "Hello Alice!";
        assertEquals(expected2, greeting2);
    }

    @Test
    public void shouldReturnHelloThirdName () throws Exception{

        ///WHEN
        String greeting3 = name.helloName("ho ho ho");
        ///THEN
        String expected3 = "Hello ho ho ho!";
        assertEquals(expected3,greeting3);

    }

}
