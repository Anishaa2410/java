package com.dit.java.Arrays;
//find diff bet max and min
public class span {
    public static void main(String[] args) {
        int arr[]= new int[]{10,90,44,66,100,33,44};
        int max= arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max= arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Span of the array is " + (max-min));
    }
}
