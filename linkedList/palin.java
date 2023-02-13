package com.dit.java.linkedList;

import java.util.Collections;

class Node{
    int data;
    Node next;
    Node( int data){
        this.data=data;
        this.next=null;
    }
}
public class palin {
    private Node head;
    Node reverse(){
        Node temp,curr= head, prev =null;
        while(curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return head = prev;
    }

    Node mid(){
        Node slow,fast;
        slow = fast = head;
        while(fast.next != null && fast != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // boolean palind(){
    //     if(head == null){
    //         return true;
    //     }
    //     Node m = mid();
    //     Node r = reverse();
        
    // }

    void print(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current= current.next;
        }
    }
    public static void main(String[] args) {
        palin obj = new palin();
        obj.head= new Node(1);
        obj.head.next = new Node(2);
        obj.head.next.next = new Node(3);
        obj.head.next.next.next = new Node(4);
        obj.head.next.next.next.next = new Node(5);
        obj.head.next.next.next.next.next = new Node(7);
        obj.head.next.next.next.next.next.next = new Node(8);
        obj.print();
        obj.reverse();
        obj.print();
        Node m = obj.mid();
        System.out.println(m.data);
        
        
    }
}
