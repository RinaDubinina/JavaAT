package com.ekaterinadubinina.exercise.two.String;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BalanceXYTest {

   ///GIVEN
    BalanceXY xyBalance = new BalanceXY();

    @Test
    public void shouldReturnXYBalanceFirst(){
        ///WHEN
        boolean actual=xyBalance.xyBalance("aaxbby");

        ///THEN
        boolean expected = true;
        assertEquals(expected,actual);
    }

    @Test
    public void shouldReturnXYBalanceSecond(){
        ///WHEN
        boolean actual=xyBalance.xyBalance("12xabxxydxyxyzz");

        ///THEN
        boolean expected = true;
        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturnXYBalanceThird(){
        ///WHEN
        boolean actual=xyBalance.xyBalance("");

        ///THEN
        boolean expected = true;
        assertEquals(expected,actual);
    }

}
