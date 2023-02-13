package com.dit.java.Strings;

import java.util.Scanner;

public class rev {
    static String reverse(String str){
        String reverse = "";
        for(int i=str.length()-1; i>=0; i--)
           reverse+=str.charAt(i);
        return reverse;
    }
    public static void main(String args[]) {
      String str = "hello anisha";
      System.out.println(reverse(str));
    }
}

