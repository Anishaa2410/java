package com.dit.java.extras;

import java.util.*;
public class list {
    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(6);
        l1.add(4);
        l1.add(6);
        l1.add(63);  // inserts 5 at the 5th index in l1
        l1.addLast(100);
        l1.addFirst(0);
        l1.set(1, 566);

        System.out.println(l1);
        System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));

    }
}