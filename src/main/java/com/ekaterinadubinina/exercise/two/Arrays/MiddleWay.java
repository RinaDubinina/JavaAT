package com.ekaterinadubinina.exercise.two.Arrays;

public class MiddleWay {
    public int[] middleWay(int[] a, int[] b) {
        if (a == null || b == null) {
            throw new NullPointerException();
        }
        if (a.length != 3 || b.length != 3) {
            throw new IllegalStateException();
        }
        int[] array = {a[1], b[1]};
        return array;
    }
}
