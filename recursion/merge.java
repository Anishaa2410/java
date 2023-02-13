package com.dit.java.recursion;

public class merge {

    static int[] mer(int[] a, int[] b){
        int m = a.length;
        int n = b.length;
        int res[] = new int[m+n];
        int i =0, j =0,k =0;
        while(i<m && j<n){
            if(a[i]<= b[j]){
                res[k++] = a[i++];
            }
            else{
                res[k++] = b[j];
                j++;
            }
            
        }
        if(i==m ){
            while(j< n){
                res[k++] = b[j++];
            }
        }

        if(j==n){
            while(i< m){
                res[k] = a[i];
                k++;
                i++;
            }
        }
        return res;
    }

    
    public static void main(String[] args) {
        int arr_1[] = {10,20,30,40,50};
        int arr_2[] = {55,77,78,90,95,96};
        int arr_3[] = mer(arr_1, arr_2);
        for (int i : arr_3) {
            System.out.print(i+ " ");
        }
    }
}
