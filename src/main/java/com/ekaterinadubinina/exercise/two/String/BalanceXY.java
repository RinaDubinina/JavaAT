package com.ekaterinadubinina.exercise.two.String;

public class BalanceXY {
    public boolean xyBalance(String str) {
        int y = str.lastIndexOf("y");
        int x = str.lastIndexOf("x");
        if (str == null) {
            throw new NullPointerException();
        }
        return (y >= 0 && y > x) || (y < 0 && x < 0);
    }
}
