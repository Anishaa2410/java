package com.dit.java.Strings;
import java.util.*;

public class strings {
    public static void main(String args[]) {
        String a="listen";
        String b="silent";
    //     StringBuilder b=new StringBuilder();
    //     for(int i=0;i<a.length()-1;i++){
           
    //         if(a.charAt(i)== a.charAt(i+1)){
    //             continue;
    //         }
    //         else{
    //             b.append(a.charAt(i));
    //         }
            
           
    //     }
    //     System.out.println(b);
    // }

    //anagram String
    if(a.length()!= b.length()){
        System.out.println("not");
        return;
    }
    char a1[]=a.toCharArray();
    char a2[]=b.toCharArray();
    Arrays.sort(a1);
    Arrays.sort(a2);
    for(int i=0;i<a1.length;i++){
        if(a1[i]!=a2[i]){
            System.out.println("not");
            return;
        }
    }
    System.out.println("anagram");
}
    
}
