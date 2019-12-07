package com.ekaterinadubinina.exercise.two.String;

public class RepeatEnd {
    public String repeatEnd(String str, int n) {
        String result = "";
        if (str == null) {
            throw new NullPointerException();
        }
        for (int i = 0; i < n; i++) {
            String strNew = str.substring(str.length() - n, str.length());
            result = result + strNew;
        }
        return result;
    }
}
