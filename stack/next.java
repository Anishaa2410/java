package com.dit.java.stack;
import java.util.Stack;

public class next {
    static void check(int arr[],int n) {
        
        Stack<Integer> st = new Stack<Integer>();
        int[] s = new int[n];
     
        for (int i = n-1; i >= 0; i--)
        {
            // Pop elements from stack while stack is not empty and top of stack is smaller than arr[i].
            while (st.empty() == false && st.peek() <= arr[i]){
                st.pop();
            }
          // If stack becomes empty, then no element is greater on left side. 
            if (st.empty() == true)
                s[i] = -1;
            else
                s[i] = st.peek() ;
            st.push(arr[i]);
        }
        for (int i : s) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,10,15,8,9,12,6};
        check(arr,arr.length);
    }
}
