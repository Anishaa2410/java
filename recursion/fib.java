package com.dit.java.recursion;

public class fib {
    static int n1=0,n2=1,n3=0;    
    static int printFibonacci(int count){    
       int res=0; 
       if(count>0){ 
          n3 = n1 + n2;    
            n1 = n2;    
            n2 = n3;    
            //System.out.print(" "+n3);
            printFibonacci(count-1);
            res= n3;  
            
        } 
        return res;
    }
    public static void main(String[] args) {
        int num =9;
        // System.out.print(n1+" "+n2);//printing 0 and 1    
        System.out.println(printFibonacci(num));     
    }
}
