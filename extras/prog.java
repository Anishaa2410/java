import java.util.*;
public class prog {
    public static void main(String args[]){
        System.out.println("Enter");
        Scanner sc=new Scanner(System.in);
        String orig = sc.nextLine();
        String rev="";
        int len=orig.length();
        for(int i=len-1;i>=0;i--){
             rev=rev+orig.charAt(i);
        }
        if(orig.equals(rev)){
            System.out.println("yes");
        }
        else{
            System.out.println("not palindrome");
        }
        sc.close();
        
    }
}
