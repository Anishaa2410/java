package com.dit.java.recursion;

public class basic {
    static void show(int n) {
        if(n == 0) {
            return;
        }
        System.out.print(n);
        show(n - 1);
        System.out.print(n);
    }
    public static void main(String[] args) {
        int n = 5;
        show(n);
    }    
}