package com.dit.java.oops;

public class altPrime {
    static boolean check(int num){
        for(int i = 2; i<=num/2;i++){
            if(num%i == 0){
                return false; // not prime
            }
        }
        return true;
    }

    static void print(int num){
        int temp = 2; //to print alternate nums
        for(int i =2;i<=num-1;i++){
            boolean x = check(i);
            if(x == true){
                if(temp % 2 == 0){
                    System.out.print(i +" ");
                }
                temp++;
            }
        }
    }

    static int countPrimes(int n) {
        int count = 0;
        int i =2;
        while(i < n){
            if(check(i)) count++;
            i++;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(countPrimes(n));
        
    }
}
