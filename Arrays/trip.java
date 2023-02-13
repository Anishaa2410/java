package com.dit.java.Arrays;

import java.util.Arrays;

public class trip {
    //return true if tripple num exist whose sum is equal to sum
    static void find3Numbers(int A[], int arr_size , int sum) { 
        Arrays.sort(A);
        int l,r;
        for (int i = 0; i < arr_size - 2; i++) {
  
            l = i + 1; 
            r = arr_size - 1;
            while (l < r) {
                if (A[i] + A[l] + A[r] == sum) {
                    for(int j = i ;j<=r;j++){
                        if(A[j] + A[l] + A[r] == sum){
                            System.out.println(A[j] + " " + A[l] +" " + A[r]);
                        }
                    }
                    
                    i++;
                    // return true;
                }
                else if (A[i] + A[l] + A[r] < sum)
                    l++;
  
                else 
                    r--;
            }
        }
  
        //  return false;
        
    }
    public static void main(String[] args) {
        int[] A = {1, 4 ,45, 6, 10, 8,3,9,2};
        //System.out.println(find3Numbers(A, 6, 13));
        find3Numbers(A, 6, 13);
        
    }
}
