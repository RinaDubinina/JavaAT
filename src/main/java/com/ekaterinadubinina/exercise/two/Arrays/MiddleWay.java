package com.ekaterinadubinina.exercise.two.Arrays;

public class MiddleWay {
    public int[] middleWay(int[] a, int[] b) {
        if (a == null || b == null) {
            throw new NullPointerException();
        }
        int[] array = {a[1], b[1]};
        return array;
    }
}
