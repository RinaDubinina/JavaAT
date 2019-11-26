package com.ekaterinadubinina.exercise.two.String;

public class BalanceXY {
    public boolean xyBalance(String str) {
        int y=str.lastIndexOf("y");
        int x=str.lastIndexOf("x");
        if ((y>=0 && y>x) || (y<0 && x<0)) return true;
        return false;
    }
}
