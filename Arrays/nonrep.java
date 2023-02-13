package com.dit.java.Arrays;

public class nonrep{
    static int non(String s) {
        int arr[] = new int[256];
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) != ' '){
                arr[s.charAt(i)]++;
            }
        }
        int count = 0;
        for(int i = 0;i<s.length();i++){
            if(arr[s.charAt(i)] == 1){
                count++;
                System.out.println(s.charAt(i));
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(non("123~3333"));
    }
}
