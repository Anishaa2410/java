package com.dit.java.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class add {

    public static List<Integer> addToArrayForm(int[] num, int k) {
        int car = 0;
        List<Integer> res = new ArrayList<>();
        for(int i = num.length-1 ; i>=0; i--){
            int rem = k%10;
            k= k/10;
            int sum = rem+ num[i]+car;
            
            if(i ==0 ){
                if(k !=0){
                    car = (sum/10) +k ;
                }
                else{
                    car = sum/10 ;
                }
                
                sum = sum%10;
                res.add(sum);
                if(car != 0){
                    res.add(car);
                }
            }
            
            else if(sum>9){
                car = sum/10;
                sum = sum%10;
                res.add(sum);
            }
            else {
                car = 0;
                res.add(sum);
            }
            
        }
        Collections.reverse(res);
        return res;
    }

    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        Arrays.sort(arr);
        while(l<k){
            l++;
        }
        return arr[l];
    } 
    public static void main(String[] args) {
        int arr[]= new int[]{2,1,3};
        int narr[] = new int[]{5,6,4};

        int k =808;
        System.out.println(addToArrayForm(arr,k));
        

        // int sum[] = new int[arr.length];
        // int j;
        // int carr=0;
    
        // for(int i=(arr.length-1);i>=0; i--) {
    
        //     if(i==0){
        //         j = arr[i] + narr[i]+carr;
        //         sum[i] = j;
        //     }
        //     else{
        //         j = arr[i] + narr[i]+ carr;
        //         int res = j % 10;
        //         sum[i] = res;
        //         carr = j/10;
        //     }
            
        // }
        // for (int i : sum) {
        //     System.out.print(i);
        // }
    }
}
