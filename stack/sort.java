package com.dit.java.stack;
import java.util.Stack;

public class sort {
    static void insert(Stack<Integer> s , int ele){
        if(s.isEmpty() || s.peek() < ele){
            s.push(ele);
            return;
        }
        else{
            int temp = s.pop();
            insert(s,ele);
            s.push(temp);
        }
    }
	static Stack<Integer> sorting(Stack<Integer> s)
	{
		if(!s.isEmpty()){
		    int temp = s.pop();
		    sorting(s);
		    insert(s,temp);
		}
		return s;
	}
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(33);
        st.push(431);
        st.push(613);
        st.push(343);
        System.out.println(sorting(st));
    }
}
