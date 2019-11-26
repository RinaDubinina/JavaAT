package com.ekaterinadubinina.exercise.two.Arrays;

public class CenteredAverage {
    public int centeredAverage(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
            sum = sum + nums[i];
        }
        return ((sum - min - max) / (nums.length - 2));
    }
}
