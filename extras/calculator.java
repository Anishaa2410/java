package com.dit.java.extras;

import java.util.*;
class Calci{
    public void add(int x,int y){
        System.out.println(x+y);
    }

    public void sub(int x,int y){
        System.out.println(x-y);
    }

    public static void main(String args[]){
        System.out.println("Enter digits");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Select operation= 1>add 2>sub ");
        int op=sc.nextInt();
        
        Calci obj=new Calci();
        if(op==1){
            obj.add(a,b);
        }
        else if(op==2){
            obj.sub(a,b);
        }
        
        sc.close();
    }
}
   