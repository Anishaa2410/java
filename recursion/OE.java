package com.dit.java.recursion;

public class OE {
    static void oddEven(int n){
        if(n==0){
            return;
        }
        if(n%2 !=0){
            System.out.print(n+" ");
        }
        oddEven(n-1);
        if(n%2 ==0){
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        int n=10;
        oddEven(n);
    }
}
