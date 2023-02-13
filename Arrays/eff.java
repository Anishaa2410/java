package com.dit.java.Arrays;

public class eff {
    public static void main(String[] args) {
        int arr[]= new int[]{1,3,0,2,5,0,5};
        int count=0;
        for(int i= 0;i< arr.length;i++){
            if(arr[i]!=0){
                
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
