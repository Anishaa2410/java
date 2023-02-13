package com.dit.java.recursion;

import java.util.ArrayList;

public class mazeDiag {
    static ArrayList<String> diag(int cr, int cc, int er, int ec){
        if(cr==er && cc==ec){
            ArrayList<String> temp = new ArrayList<>();
            temp.add("");
            return temp;
        }
        if(cr>er || cc>ec){
            ArrayList<String> emp = new ArrayList<>();
            return emp;
        }
        ArrayList<String> result =new ArrayList<>();

        ArrayList<String> horizontal = diag(cr, cc+1, er,ec);
        for (String s : horizontal) {
            result.add("H"+s);
        }

        ArrayList<String> vertical = diag(cr+1, cc, er,ec);
        for (String s : vertical) {
            result.add("V"+s);
        }
        ArrayList<String> diagnal = diag(cr+1, cc+1, er,ec);
        for (String s : diagnal) {
            result.add("D"+s);
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<String> res = diag(0, 0, 2, 2);
        System.out.println(res);
        System.out.println("Total ways : " +res.size());
    }
}
