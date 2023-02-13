package com.dit.java.recursion;

public class quickSort {
    

        static void quick(int arr[], int low, int high) {
            if(low >= high) {
                return;
            }
            int mid = (low + high) / 2;
            int pivot =  arr[mid];
            int left = low;
            int right = high;
            while(left <= right) {
                while(arr[left] < pivot) {
                    left++;
                }
                while(arr[right] > pivot) {
                    right--;
                }
                //2,7,79,4,66,0,76
                if(left <= right) {
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }
            }
            quick(arr, low, right); // small problem to sort left of pivot
            quick(arr, left, high); // small problem

        }
        static void print(int arr[]){
            for (int i : arr) {
                System.out.print(i + " ");
            }
        }
    
        public static void main(String[] args) {
            int[] arr = {2,7,79,4,66,0,76};
            int low = 0;
            int high = arr.length-1;
            quick(arr, low, high);
            print(arr);
        }
    
}
