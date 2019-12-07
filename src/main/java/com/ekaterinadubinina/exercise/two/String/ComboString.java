package com.ekaterinadubinina.exercise.two.String;

public class ComboString {
    public String comboString(String a, String b) {
        if (a == null || b == null) {
            throw new NullPointerException();
        } else if (a.length() < b.length()) {
            return (a + b + a);
        }
        return (b + a + b);
    }
}
