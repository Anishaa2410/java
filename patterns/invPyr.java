package com.dit.java.patterns;

public class invPyr {
    public static void main(String[] args) {
        for(int i=1;i<5;i++){
            for(int j=4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
