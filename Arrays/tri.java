package com.dit.java.Arrays;

import java.util.Arrays;

public class tri {
    static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i =nums.length-3;i>=0;--i){
            if(nums[i]+nums[i+1] > nums[i+2]){
                return nums[i]+nums[i+1]+nums[i+2];
            }
            }
        return 0;
    }
    public static void main(String[] args) {
        int[] a = {2,1,2,4,3,4,8};
        
        System.out.println(largestPerimeter(a));
    }
}
