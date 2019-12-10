package com.ekaterinadubinina.exercise.two.Arrays;

public class More14 {
    public boolean more14(int[] nums) {
        int elementEqual1 = 0;
        int elementEqual4 = 0;
        if (nums == null) {
            throw new NullPointerException();
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                elementEqual1++;
            }
            if (nums[i] == 4) {
                elementEqual4++;
            }
        }
        return elementEqual1 > elementEqual4;
    }
}
