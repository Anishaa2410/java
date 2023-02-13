package com.dit.java.recursion;

public class climbingstairs {
    static int climb(int n){
        if(n ==0 || n==1){
            return 1;
        }
        else if(n ==2){
            return 2;
        }
        else{
            int steps=  climb(n-1)+climb(n-2);
            return steps;
        }
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(climb(n));
    }
}
