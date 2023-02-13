package com.dit.java.stack;

import java.util.Arrays;

class aa {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n= nums2.length;
        int med;
        double result;
        int arr[] = new int[m+n];
        for(int i=0;i<m;i++){
            arr[i] = nums1[i];
        }
        for(int i=m,j=0; j<n;i++,j++){
            arr[i] = nums2[j];
        }
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
        int len= arr.length; 
       // System.out.println(len);
        if( len % 2 != 0){
            med= (len+1)/2;
            result = arr[med-1];
            System.out.println(result);
            return result;
        }else{
            med = (arr[(len/2)-1] + arr[((len/2)+1)-1])/2;
            System.out.println(arr[(len/2)-1]);
            System.out.println(arr[((len/2)+1)-1]);
            // med =(2+3)/2;

        result= med;
        System.out.println(result);
        return result;
        }
    
    }
    public static void main(String[] args) {
        int arr[] = {1,3,7};
        int arr2[] = {2,4,98};
        findMedianSortedArrays(arr,arr2);
    }
}