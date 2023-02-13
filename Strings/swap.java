package com.dit.java.Strings;

public class swap {
    static String swap1(String str, int i, int j)
        {
            char ch[] = str.toCharArray();
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            String string = String.valueOf(ch);
            return string;
        }
    static boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        if(s.equals(goal)){
            return true;
        }
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                String n =swap1(s,i,j);
                System.out.println(n);
                if(n.equals(goal)){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean buddyString(String A, String B) {
        int[] arrA = new int[26];
        int[] arrB = new int[26];
        if(A.length() != B.length()) return false;
        
        for(int i = 0; i < A.length(); i++) {
            arrA[A.charAt(i)-'a']++;
        }
        
        for(int i = 0; i < B.length(); i++) {
            arrB[B.charAt(i)-'a']++;
        }
        
        //check number of chars are same in both strings
        for(int i=0; i<26; i++) {
            if(arrA[i] != arrB[i]) return false;
        }
        
        //check number of different char
        int count = 0;
        for(int i=0; i<A.length(); i++){
            if(A.charAt(i) != B.charAt(i)) count++;
        }
        
        //if only two then true
        if(count == 2) return true;
        
        //if both strings are same and any char are more than once
        if(count == 0) {
            for(int i=0; i<26; i++) {
                if(arrA[i] > 1) return true;
            }
        }
        
        return false;
    }
    public static void main(String[] args) {
        String s= "aaaaaaabc";
        String b = "aaaaaaacb";
        
        System.out.println(buddyStrings(s,b));
        System.out.println(buddyString(s,b));
    }
}
