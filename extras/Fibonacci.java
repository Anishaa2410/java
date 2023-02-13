package com.dit.java.extras;

public class Fibonacci {
    
    
    public static void main(String args[]){
        int a=0,temp=1,sum=0;
        int num=10;
        System.out.print(a+" "+temp);
        int i =1;
        while(i < num){
            sum=a+temp;
            System.out.print(" "+sum);
            a=temp;
            temp=sum;
            i++;
        }
    }

    
}
