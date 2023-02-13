package com.dit.java.stack;
import java.util.Stack;

public class infToPost {
    static int prec(char ch){
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    static String Inf(String exp){
        String res ="";
        Stack<Character> st = new Stack<Character>();
        for(int i = 0;i< exp.length();i++){
            char c = exp.charAt(i);
            if(Character.isLetterOrDigit(c)){
                res+=c;
            }
            else if( c == '('){
                st.push(c);
            }
            else if(c == ')'){
                while(!st.isEmpty() && st.peek() != '('){
                    res += st.pop();
                }
                if(!st.isEmpty() && st.peek() != '(') {
                    return "Invalid Expression";
                }
                else {
                    st.pop();
                }
            }
            else{
                while(!st.isEmpty() && prec(c) <= prec(st.peek()) ){
                    if(st.peek() == '(') {
                        return "Invalid Expression";
                    }
                    res+=st.pop();
                }
                st.push(c);
            }
        }
        while(!st.isEmpty()){
            res += st.pop();
        }
        return res;
    }
    public static void main(String[] args) {
        String expression = "a+b*(c^d-e)^(f+g*h)-i";
        // abcd^e-fgh*+^*+i-  output
        System.out.println(Inf(expression));
    }
}

