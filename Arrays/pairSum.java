package com.dit.java.Arrays;

import java.util.Arrays;

public class pairSum {

    static int getPairsCount(int[] arr, int n, int k) {
        // code here
        int count = 0;
        int high = n-1, low = 0;
        Arrays.sort(arr);
        while(low < high){
            if(arr[low] + arr[high] == k){
                int x=arr[low];
               for(int i=low+1;i<=high;i++)
               {
                   if(x+arr[i]==k) {
                    count++;
                    System.out.println(x + " " + arr[i]);
                   }    
               }
               low++;
            }
            if(arr[low] + arr[high] > k){
                high--;
            }
            else if(arr[low] + arr[high] < k){
                low++;
            }
            
        }
        return count;
        
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5};
        int target = 5;
        System.out.println(getPairsCount(arr,5,5));
        // method 1
        // for(int i=0;i<arr.length;i++){
        //     for(int j=1;j<arr.length;j++){
        //         if(arr[i]+arr[j]==target){
        //             System.out.println(arr[i]+ "+" +arr[j]+"="+target);
        //             // return; //remove this if you want all pairs
        //         }
        //     }
        // }

        // method 2
        // Arrays.sort(arr);
        // int first= 0, last= arr.length-1;
        // while(first<last){
        //         if(arr[first]+ arr[last]== target){
        //             System.out.println(arr[first]+ " " +arr[last]);
        //             return;
        //         }
        //         if(arr[first]+ arr[last] < target){
        //             first++;
        //         }
        //         if(arr[first]+ arr[last] > target){
        //             last--;
        //         }
        //     }

            
    }
}
