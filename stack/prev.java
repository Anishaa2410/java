package com.dit.java.stack;
import java.util.Stack;

public class prev {
    void check(int arr[],int n) {
        
        Stack<Integer> st = new Stack<Integer>();
        st.push(arr[0]);
        // Previous greater for first element is always -1.
        System.out.print("-1, ");
     
        for (int i = 1; i < n; i++)
        {
     
            // Pop elements from stack while stack is not empty and top of stack is smaller than arr[i].
            while (st.empty() == false && st.peek() < arr[i]){
                st.pop();
            }
          // If stack becomes empty, then no element is greater on left side. 
            if (st.empty() == true)
                System.out.print("-1, ");
            else
                System.out.print(st.peek() + ", ");
     
            st.push(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = { 15,10,18,12,4,6,2,8};
        prev obj =new prev();
        obj.check(arr,arr.length);
    }
}
