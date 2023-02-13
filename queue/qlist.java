package com.dit.java.queue;

class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class qlist {
    Node front, rear;
    int size;
    qlist() {
        front = rear = null;
        size = 0;
    }

    void enqueue(int x) {
        Node temp = new Node(x);
        if(front == null) {
            front = rear = temp;
            return;
        }
        rear.next = temp;
        rear = temp;
        size++;
    }

    void dequeue() {
        if(front == null) {
            return;
        }
        front = front.next;
        if(front == null) {
            rear = null;
        }
    }

    void print(){
        Node current = front;
        while(current != null){
            System.out.print(current.data + " ");
            current= current.next;
        }
    }

    public static void main(String[] args) {
    qlist ql = new qlist();
    ql.enqueue(10);
    ql.enqueue(20);
    ql.enqueue(30);
    ql.print();
    System.out.println("\nafter dequeue");
    ql.dequeue();
    ql.print();
    }

}


    
