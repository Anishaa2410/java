package com.dit.java.maths;

public class trailingFactorial {
    static long fact(long n){
        if(n == 0){
            return 1;
        }
        else{
            long f =  n*fact(n-1);
            return f;
        }
        
    }
    public static void main(String[] args) {
        long n = 15;
        long res = 0;
        for(int i = 5;i<=n;i=i*5){
            res= res+ (n/i);
        }
        System.out.println(res);
        System.out.println(fact(n));

    }
}
