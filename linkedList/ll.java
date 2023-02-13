package com.dit.java.linkedList;
class Node{
    int data;
    Node next;
    Node( int data){
        this.data=data;
        this.next=null;
    }
}
public class ll {
    public static void main(String[] args) {
        Node obj= new Node(10);
        Node obj1= new Node(20);
        obj.next=obj1;
        Node curr = obj;
        while(curr != null){
            System.out.println(curr.data);
            curr= curr.next;

        }
    }
    
}
