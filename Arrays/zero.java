package com.dit.java.Arrays;
public class zero {
    public static void main(String[] args) {
        int arr[]= new int[]{1,3,0,2,5,0,5};
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]== 0 ){
                for(int j= i+1; j<arr.length; j++){
                    if(arr[j] !=0){
                        int temp;
                        temp = arr[i];
                        arr[i]= arr[j];
                        arr[j]=temp;
                    }
                }
                
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }

    }
}
