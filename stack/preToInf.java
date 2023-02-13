package com.dit.java.stack;
import java.util.Stack;

public class preToInf {
    static String Inf(String exp1){
        
        StringBuilder res = new StringBuilder();
        Stack<String> st = new Stack<String>();
        StringBuilder exp = new StringBuilder();
 
        // append a string into StringBuilder input1
        exp.append(exp1);
        // reverse StringBuilder input1
        exp.reverse();
        
        for(int i = 0;i< exp.length();i++){
            char c = exp.charAt(i);
            if(Character.isLetterOrDigit(c)){
               st.push(c+ "");
            }
            else{
                String x = st.pop();
                String y = st.pop();
                st.push(')'+ y + c + x + '(' );
            }
        }
        res.append(st.peek());
        res.reverse();
        return res.toString();
    }

    public static void main(String[] args) {
        String expression = "*-A/BC-/AKL";
        System.out.println(Inf(expression));
        //(A-B/C)*(A/K-L)
    }
}
