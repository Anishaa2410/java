package com.dit.java.stack;

import java.util.ArrayList;
import java.util.Stack;

public class leaders {
    static ArrayList<Integer> leader(int arr[], int n){
        // Your code here
        ArrayList<Integer> l = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        for(int i =n-2;i>=0;i--){
            if(arr[i]>= st.peek() ) st.push(arr[i]);
        }
        while(!st.isEmpty()){
            l.add(st.peek() );
            st.pop();
        }
        
        return l;
    }
    public static void main(String[] args) {
        int arr[] = {16,17,4,3,5,2};
        int n =  arr.length;
        System.out.println(leader(arr, n));
        // The first leader is 17 
        // as it is greater than all the elements
        // to its right.  Similarly, the next 
        // leader is 5. The right most element 
        // is always a leader so it is also 
        // included.
    }
}
