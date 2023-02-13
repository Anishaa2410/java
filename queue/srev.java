package com.dit.java.queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class srev {
    static Stack<Integer> st = new Stack<>();
    static Queue<Integer> st1 = new LinkedList<>();
    
    static void rev( Queue<Integer> s){
        while(!s.isEmpty()){
            st.push(s.poll());
        }
        while(!st.isEmpty()){
            int ele = st.peek();
            st1.add(ele);
            st.pop();
        }
        System.out.println(st1);
    }
    static void print(Stack<Integer> x){
        for (int e : x) {
            System.out.print(e+ " ");
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.println(q);
        System.out.println("After reverse ....");
        rev(q);

    }
}
