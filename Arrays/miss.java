package com.dit.java.Arrays;
//prog to find missing number in n natural numbers
public class miss {
    public static void main(String[] args) {
        int arr[]= new int[]{2,3,5};
        int sum=0,nsum=0;
        for(int el : arr){
            sum+=el;
        }
        for(int i=arr[0];i<=arr[arr.length-1];i++){
            nsum+=i;
        }
        System.out.println("missing number is " +(nsum-sum));
        
    }
}
