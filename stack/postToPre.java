package com.dit.java.stack;
import java.util.Stack;
public class postToPre {
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
                st.push( c +x + y );
            }
        }
        return st.peek();
    }
    public static void main(String[] args) {
        String expression = "ABC/-AK/L-*";
        //  *-A/BC-/AKL  output
        System.out.println(posToInf(expression));
    }
}
