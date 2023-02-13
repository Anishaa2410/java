package com.dit.java.Arrays;

public class platform {
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        int i = 0, count=0;
        while(i<n-1){
            int diff = arr[i+1] - dep[i];
            if(diff < 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {900, 1100, 1235};
        int dep[] = {1000, 1200, 1240};
        System.out.println(findPlatform(arr, dep, 3));
    }
}
