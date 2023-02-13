package com.dit.java.Arrays;

public class rotate {
    //rotate starting k elements
    static void rotateArr(int nums[], int k, int n)
    {
        k %= n;
        if(k<0){
            k+=n;
        }
        reverse(nums, 0, k-1);
        reverse(nums, k , n-1 );
        reverse(nums, 0, n - 1);
    }
    static void reverse(int[] arr, int first,int last) {
        
        while(first<last ){
            int temp=arr[last];
            arr[last]=arr[first];
            arr[first]=temp;
            first++;
            last--;
            
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int rotate = 2;
        rotateArr(arr, rotate, n);
        for(int a : arr){
            System.out.print(a+",");
        }
    }
}
