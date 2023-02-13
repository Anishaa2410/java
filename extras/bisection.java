package com.dit.java.extras;

import java.util.*;
public class bisection {
    static double max;
    
    static double fuct( double x){
        return (x*x*x)-(4*x)-9;
    }

    static double camp(double a,double b){
        double x1=fuct(a);
        double x2=fuct(b);
        double r=(x1*x2);
        if(r<0){
            double x0=(x1*x2)/2;
            System.out.println(x0);
            for(int i=1;i< max;i++){
                double r1=fuct(x0)*x1;
                if(r1<0){
                    x2=x0;
                }
                else{
                    x1=x0;
                }
                
            }
            System.out.println("Answer is"+x0);
        }    
        else{
            System.out.println("Error!!");
            
        }    
        return 1;
    }
    public static void main(String args[]){
    System.out.println("Enter"); 
    Scanner sc=new Scanner(System.in);
    double y1=sc.nextDouble();
    double y2=sc.nextDouble();
    max=sc.nextDouble();
    camp(y1,y2);
    sc.close();
    }
}
