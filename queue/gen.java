package com.dit.java.queue;

import java.util.LinkedList;
import java.util.Queue;

public class gen {
    
    public static void main(String[] args) {
        Queue<String> ql = new LinkedList<>();
        Queue<String> res = new LinkedList<>();
        int n = 10;
        ql.add("5");
        ql.add("6");
        for(int i =1;i<=n;i++){
            String cur = ql.poll();
            res.add(cur);
            ql.add(cur + "5");
            ql.add(cur + "6");
        }
        System.out.print(res);
    }
   
    
}
