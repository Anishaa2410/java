package com.dit.java.stack;
import java.util.Stack;
public class postToInf {

    static String posToInf(String exp){
        Stack<String> st = new Stack<String>();
        for(int i = 0;i< exp.length();i++){
            char c = exp.charAt(i);
            if(Character.isLetterOrDigit(c)){
                st.push(c + "");
            }
            else{
                String y = st.pop();
                String x = st.pop();
                st.push("(" + x + c + y + ")");
            }
        }
        return st.peek();
    }
    public static void main(String[] args) {
        String expression = "ab*c+";
        // abcd^e-fgh*+^*+i-  output
        System.out.println(posToInf(expression));
    }
}
