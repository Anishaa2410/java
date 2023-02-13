package com.dit.java.extras;

public class perfectsquare {
    static boolean isEven(int n){

        int r,c=0;

        while(n>0){

        r = n%10;

        if(r%2==0){

           c++;

        }

        n = n/10;

     }

       if(c==4){

       return true;

      }

     else{

          return false;

        }

    }

     static boolean isPerfectSquare(int n)

    {
      for (int i = 1; i * i <= n; i++) {

             if ((n % i == 0) && (n / i == i)) {

                return true;

         }

     }
        return false;

  }
  

   public static void main(String[] args) {
    int i;

    for(i=1000; i<10000; i++){

     if(isPerfectSquare(i) && isEven(i)){

          System.out.println(i);

     }    

    }
    
   } 
}
