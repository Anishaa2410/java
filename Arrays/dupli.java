package com.dit.java.Arrays;

public class dupli {
    public static void main(String[] args) {
        int arr[] = new int[]{10,10,20,20,40,40,50,50,60,60,60,3,3,8};
        int anew[] = new int[arr.length-1];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(i == arr.length-1 || arr[i] != arr[i+1] ){
                anew[j]= arr[i];   //creating a new array to store elements
                j++;

                System.out.print(arr[i] + " "); //without creating a new array
            }
        }
        // for (int i : anew) {
        //     System.out.println( i);
        // }
    }
    
}
