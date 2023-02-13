package com.dit.java.patterns;

public class num {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }

        //2nd type
        System.out.println();

        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        //3rd
        System.out.println();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
