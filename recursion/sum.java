package com.dit.java.recursion;

public class sum {
    static int sumd(int n,int sum){
        if(n == 0){
            return sum;
        }
        sum += n%10;
        n=n/10;
        return sumd(n,sum);
    }
    public static void main(String[] args) {
        int n = 787943;
        int sum = 0;
        int op = sumd(n, sum);
        System.out.println(op);
    }
}
