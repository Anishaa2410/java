package com.dit.java.Strings;

public class aa {
    
        public static int myAtoi(String s) {
            
            int value=0,flag =0;
            loop1:
            for(int i = 0;i<s.length();i++){
                char c= s.charAt(i);
                if(c== ' '){
                    continue;
                }
                if(Character.isLetter(c)){
                    break loop1;
                }
                else if(c== '-'){
                    flag=1;
                }
                else if(Character.isDigit(c)){
                    value =(value*10) + c-'0';
                }
            }
            value = flag==1 ? -value : value; 
            if(value < Integer.MIN_VALUE){
                value = Integer.MIN_VALUE;
            }
            else if(value> Integer.MAX_VALUE){
                value = Integer.MAX_VALUE;
            }
            return value;
        }
    

    public static void main(String[] args) {
        String s = "2147483649";
        int a= myAtoi(s);
        System.out.println(a);

    }
}
