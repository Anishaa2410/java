package com.dit.java.recursion;

public class zero {
    static int count(int n, int counter){
        if(n==0){
            return counter;
        }
        if(n%10 == 0){
            counter++;
        }
        n=n/10;
        return count(n, counter);
    }
    public static void main(String[] args) {
        int n = 10002005;
        int c = 0;
        int x =count(n, c);
        System.out.println(x); 
    }
}
