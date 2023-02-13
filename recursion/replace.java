package com.dit.java.recursion;

public class replace {
    static String rep(String s,int index){
        if(index== s.length()){
            return null ;
        }
        if(s.indexOf("pi") == -1 ){
            return null;
        }
        String s1 =s.replaceAll("pi", "3.14");
        rep(s,index+1);
        return s1;
        
    }
    public static void main(String[] args) {
        String s= "x+y*pi+p+pi";
        int index =0;
        System.out.println(rep(s,index));
    }
}
