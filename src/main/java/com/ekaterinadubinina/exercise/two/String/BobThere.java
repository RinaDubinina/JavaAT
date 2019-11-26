package com.ekaterinadubinina.exercise.two.String;

import java.util.regex.*;

public class BobThere {
    public boolean bobThere(String str) {

        return str.matches("(\\w+)?b.b(\\w+)?");
    }

}
