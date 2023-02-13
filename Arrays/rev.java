package com.dit.java.Arrays;

public class rev {
    public static void main(String[] args) {
        int arr[] = new int[]{10,33,44,55,56,66};
        int first= 0;
        int last= arr.length-1;
        while(first<last){
            int temp=arr[last];
            arr[last]=arr[first];
            arr[first]=temp;
            first++;
            last--;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
