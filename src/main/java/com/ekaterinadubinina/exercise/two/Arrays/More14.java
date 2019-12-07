package com.ekaterinadubinina.exercise.two.Arrays;

public class More14 {
    public boolean more14(int[] nums) {
        int num1 = 0;
        int num4 = 0;
        if (nums == null) {
            throw new NullPointerException();
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                num1++;
            }
            if (nums[i] == 4) {
                num4++;
            }
        }
        return num1 > num4;
    }
}
