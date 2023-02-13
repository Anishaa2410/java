package com.dit.java.extras;

public class sqrt {
 
        public static int  squareroot(int x)
        {
            int low=1;
            int high=x;
            int ans=0;
            while(low<=high)
            {
                int mid=(low+high)/2;
                int sq=mid*mid;
                if(sq==x)
                return mid;
                else if(sq>x)
                high=mid-1;
                else if(sq<x)
                {
                low=mid+1;
                ans=mid;
                }
            }
            return ans;
        }

        public static int  root(int x){
            for(int i = 1; i<= x/2 ; i++){
                if(i*i == x && x/i == i){
                    return i;
                }
            }
            return 0;
        }

        public static int mySqrt(int x) {
            //gives count req to add or sub to make number perfect square
        int low=1;
        int high=x;
        int ans1=0;
        int ans2=0;
        int finalans=0;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int sq=mid*mid;
            if(sq==x)
            return mid;
            else if(sq>x)
            {high=mid-1;
            ans2=sq;}
            else if(sq<x)
            {low=mid+1;
            ans1=sq;}

        }
        finalans=Math.min(x-ans1,ans2-x);
        return finalans;
        }

        public static int mySqr(int x) {
            if (x == 0) return 0;
            long i = x;
            while(i > x / i)  
                i = (i + x / i) / 2;	    	
            return (int)i;
        }
        public static void main(String[] args) {
            System.out.println(mySqrt(29));
        //     long start,end;
        //     start = System.currentTimeMillis();
        //    System.out.println(root(200000000));
        //    end = System.currentTimeMillis();
        //    System.out.println(end-start);
        //     System.out.println("-----------------");
        //    start = System.currentTimeMillis();
        //    System.out.println(squareroot(100000000));
        //    end = System.currentTimeMillis();
        //    System.out.println(end-start);
        }
}

