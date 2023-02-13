package com.dit.java.stack;
import java.util.Stack;
public class midDelete {
    static Stack<Integer> deleteMid(Stack<Integer>s,int size){
        // code here
        Stack<Integer> st = new Stack<>();
        
        int count = 0;
        while (count < size / 2) {
            st.push(s.pop());
            count++;
        }
        
        
        System.out.println("popped mid element : " +s.pop());
        while(!st.isEmpty()){
            s.push(st.pop());
        }
        return s;
    } 
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(33);
        st.push(431);
        st.push(613);
        st.push(343);
        st.push(34322);
        st.push(2);
        st.push(20);
        System.out.println(st);
        System.out.println(deleteMid(st,st.size()));
        System.out.println(st.peek());
    }
}
