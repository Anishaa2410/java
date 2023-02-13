package com.dit.java.recursion;

public class power {
    static int cal(int x, int n){
        if(n == 0){
            return 1;
        }
        
            return x*cal(x, n-1);
        
        
    }
    //making code more optimised. 
    static int calc(int x, int n){
        
        if(n == 0){
            return 1;
        }
        if(n %2 ==0){
            return calc(x,n/2) * calc(x,n/2);
        }
        else{
            return (x*calc(x,n/2)) * (calc(x,n/2));
        }
        
    }
    public static void main(String[] args) {
        int x=2,n=-5;
        System.out.println(cal(x,n));
        // System.out.println(calc(x,n)); 
    }
}
