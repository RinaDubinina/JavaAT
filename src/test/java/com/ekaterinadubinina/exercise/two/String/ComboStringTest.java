package com.ekaterinadubinina.exercise.two.String;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ComboStringTest {
     ///GIVEN
   ComboString comboTwoString = new ComboString();

   @Test
   public void shouldReturnComboTwoStringFirst () throws Exception{

       ///WHEN
       String combo = comboTwoString.comboString("Hello", "hi");

       ///THEN
       String expected = "hiHellohi";
       assertEquals(expected,combo);
   }

    @Test
    public void shouldReturnComboTwoStringSecond () throws Exception{

        ///WHEN
        String combo = comboTwoString.comboString("", "bb");

        ///THEN
        String expected = "bb";
        assertEquals(expected,combo);
    }
    @Test
    public void shouldReturnComboTwoStringThird () throws Exception{

        ///WHEN
        String combo = comboTwoString.comboString("aaa", "1234");

        ///THEN
        String expected = "aaa1234aaa";
        assertEquals(expected,combo);
    }
}