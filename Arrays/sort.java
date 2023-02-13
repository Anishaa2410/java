package com.dit.java.Arrays;

public class sort {
    public static void main(String[] args) {
        int arr[]= new int[]{2,3,4,100,5,6,7};
        boolean sort=true;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                sort=false;
            }    
        }
        if(sort){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
