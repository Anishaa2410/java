package com.dit.java.stack;
import java.util.Stack;
public class infToPre {
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

    static String Inf(String exp1){
        
        StringBuilder res = new StringBuilder();
        Stack<Character> st = new Stack<Character>();
        StringBuilder exp = new StringBuilder();
 
        // append a string into StringBuilder input1
        exp.append(exp1);
        // reverse StringBuilder input1
        exp.reverse();
        
        for(int i = 0;i< exp.length();i++){
            char c = exp.charAt(i);
            if(Character.isLetterOrDigit(c)){
                
                res.append(c);
            }
            else if( c == ')'){
                st.push(c);
            }
            else if(c == '('){
                while(!st.isEmpty() && st.peek() != ')'){
                    res.append(st.pop());
                }
                if(!st.isEmpty() && st.peek() != ')') {
                    System.out.println("Invalid Expression"); 
                    break;
                }
                else {
                    st.pop();
                }
            }
            else{
                while(!st.isEmpty() && prec(c) <= prec(st.peek()) ){
                    if(st.peek() == ')') {
                        System.out.println("Invalid Expression");
                        break; 
                    }
                    res.append(st.pop());
                }
                st.push(c);
            }
        }
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        res.reverse();
        return res.toString();
    }

    public static void main(String[] args) {
        String expression = "(A-B/C)*(A/K-L)";
        System.out.println(Inf(expression));
    }
}
