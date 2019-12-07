package com.ekaterinadubinina.exercise.two.String;

public class Name {

    public String helloName(String name) {
        if (name == null) {
            throw new NullPointerException();
        }
        return ("Hello " + name + "!");
    }
}
