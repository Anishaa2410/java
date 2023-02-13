package com.dit.java.Arrays;

import java.util.Arrays;

public class check {
    public static boolean isUgly(int n) {
        // if (num == 0) return false;
        // if (num == 1) return true;

        // while (num != 1) {
        //     if (num % 2 == 0) num /= 2;
        //     else if (num % 3 == 0) num /= 3;
        //     else if (num % 5 == 0) num /= 5;
        //     else return false;
        // }
        // return true;

        int sq=0;
        while(n>0){
            int l= n%10;
            sq = sq + (l*l);
            n = n/10;
            if(n <= 0){
                if(sq == 1) return true;
                n = sq;
                sq = 0;
                
            }
        }
        
        return false;
    }
    public static void main(String[] args) {
        int n =98;
         String s = "heloo anii jhf";
        String s1[] = s.split(" ");
        for (String string : s1) {
            System.out.println(string);
        }
        String a =Arrays.toString(s1);
        System.out.println(Arrays.toString(s1));
        System.out.println(a);
        
        //System.out.println(isUgly(n));
    }
}
