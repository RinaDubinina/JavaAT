package com.ekaterinadubinina.exercise.two.String;

import java.util.regex.*;

public class BobThere {
    public boolean bobThere(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        return str.matches("(\\w+)?b.b(\\w+)?");
    }
}
