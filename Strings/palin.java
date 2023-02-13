package com.dit.java.Strings;

public class palin {
    static boolean isPalin(String s,int l,int r){
        if(l>=r) return true;
        if(s.charAt(l) != s.charAt(r)) return false;
        return isPalin(s, l+1, r-1);
    }
    static boolean ispalin(String s){
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
        System.out.println(sb.toString().getClass());
		if(s.equals(sb.toString())) return true;
		return false;
	}
    public static void main(String[] args) {
        String s = "ssss";
        System.out.println(isPalin(s,0,s.length()-1));
        System.out.println(ispalin(s));
    }
}
