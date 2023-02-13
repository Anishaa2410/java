package com.dit.java.Strings;
import java.util.*;


public class Occ {
    void freqChar(char x, String s){
        int freq=0;
        char c[]= s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]==x){
                freq+=1;
            }
        }
        System.out.println("Number of "+x+"'s present in "+s+" : "+freq);
    }

    void eachChar(String str){
        String s= removeDuplicates(str);
        char c[]= s.toCharArray();
        
        for(int i=0;i<c.length;i++){
            char check=c[i];
            freqChar(check,str);
        } 
    }

    public static String removeDuplicates(String s)
	{
		String str = new String();
		int len = s.length();
		
		for(int i = 0; i < len; i++)
		{
			char c = s.charAt(i);
			
			if(str.indexOf(c) < 0) // -1
			{
				str += c;
			}
		}
		return str;
	}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.nextLine();
        System.out.println("Enter=> \n 1 for freq of specific char \n 2 for freq of all chars");
        int choice=sc.nextInt();
        if(choice==1){
            System.out.println("Enter char");
            char c=sc.next().charAt(0);
            System.out.println("Total chars : " +s.length());
            Occ obj= new Occ();
            obj.freqChar(c,s);
        }
        else if(choice==2){
            System.out.println("Total chars : " +s.length());
            Occ obj= new Occ();
            obj.eachChar(s);
        }
        sc.close();
        
    }    
}
