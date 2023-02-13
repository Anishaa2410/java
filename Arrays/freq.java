package com.dit.java.Arrays;
import java.util.LinkedHashMap;

public class freq {
    public static void main(String[] args) {
        int a[] = new int[]{10,10,10,20,30,40,56,77,88,88};
        int freq=1,i=1 ;
        LinkedHashMap<Integer,Integer> al = new LinkedHashMap<>();
        while(i<a.length){
            while(i<a.length && a[i]==a[i-1]){
                freq++;
                i++;
            }
            System.out.println(a[i-1]+ " " +freq);
            al.put(a[i-1],freq);
            i++;
            freq=1;
        }
        if(a.length==1 || a[a.length-1] != a[a.length-2] ){
            freq=1;
            System.out.println(a[i-1]+ " " +freq );
            al.put(a[i-1],freq);
        }
        System.out.println(al);
        
    }
       

}

