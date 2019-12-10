package com.ekaterinadubinina.exercise.two.Arrays;

public class Reverse3 {
    public int[] reverse3(int[] nums) {
        if (nums == null) {
            throw new NullPointerException();
        }
        int[] array = {nums[2], nums[1], nums[0]};
        return array;
    }
}
