package com.dit.java.recursion;

public class josephus {
    static int Josephus(int n,int k){
        if(n==1){
            return 1;
        }
        //k-1, n+1 as we are starting from index 1 to n
        //k is added because we have to shift k position everytime
        // %n because we want numbers till value of n,not more than n
        int x=  (Josephus(n-1,k) +k-1)%n+1;
        return x; 
    }
    public static void main(String[] args)
    {
        int n = 6, k = 2;
        System.out.println(Josephus(n, k));
    }
}
