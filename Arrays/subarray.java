package com.dit.java.Arrays;

public class subarray {
    public static void main(String[] args) {
        // Count Sub Array
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int k = 3;
        int sub1[]= new int[k];
        int sub2[] = new int[arr.length-k];
        
        int subArrayCount = 0;
        for (int i = 0; i < k; i++) {
            subArrayCount++;
            sub1[i] = arr[i];
        }
        
        
        System.out.println(subArrayCount);
        subArrayCount = 0;
        for (int i = k,j=0; i <arr.length ; i++,j++) {
            subArrayCount++;
            sub2[j] = arr[i];
        }
        System.out.println(subArrayCount);

        for(int i : sub1){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i : sub2){
            System.out.print(i + " ");
        }
    }
}
