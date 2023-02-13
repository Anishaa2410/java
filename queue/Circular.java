package com.dit.java.queue;

class Queue{
    int[] arr;
    int front, rear;
    final int CAPACITY=10;
    Queue(){
        arr = new int[CAPACITY];
        front = rear = 0;
    }
    Queue(int len){
        arr = new int[len];
        front = rear = 0;
    }

    int getSize() {
        return rear;
    }

    boolean isEmpty() {
        return rear == 0;
    }

    void enqueue(int element){
        if(rear == arr.length){
            throw new RuntimeException("Full..");
        }
        int index = (front+rear) % arr.length;
        arr[index] = element;
        rear++;
    }

    int dequeue(){
        if(rear == 0){
            throw new RuntimeException("Empty..");
        }
        int val = arr[front];
        arr[front] = 0;
        front = (front +1) % arr.length;
        rear--;
        return val;
    }

    void print() {
        for(int i = 0; i < rear; i++) {
            int availableIndex = (front + i) % arr.length;
            System.out.println(arr[availableIndex]);
        }
    }
}
public class Circular {
    public static void main(String[] args) {
        Queue cq = new Queue(4);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.print();

        cq.dequeue();
        System.out.println("After dequeue..");
        cq.print();

        cq.enqueue(50);
        System.out.println("Enqueue..");
        cq.print();
        
    }
}
