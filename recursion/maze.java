package com.dit.java.recursion;

import java.util.ArrayList;

public class maze {
    static ArrayList<String> getMazePath(int cr, int cc, int er, int ec){
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

        ArrayList<String> horizontal = getMazePath(cr, cc+1, er,ec);
        for (String s : horizontal) {
            result.add("H"+s);
        }

        ArrayList<String> vertical = getMazePath(cr+1, cc, er,ec);
        for (String s : vertical) {
            result.add("V"+s);
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<String> res = getMazePath(0, 0, 4, 4);
        System.out.println(res);
        System.out.println("Total ways : " +res.size());
    }
}
