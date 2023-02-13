package com.dit.java.queue;

class queueOpr {
    int data[];
    int rear, front, size;
    queueOpr(int len){
        data= new int[len];
        this.front=-1;
        this.rear=-1;
        size= 0;
    }

    int getsize(){
        return size;
    }

    boolean isEmpty(){
        return size==0;
    }

    void enqueue(int element){
        if(size == data.length){
            System.out.println("Overflow..");
        }
        if(size == 0) {
            front = 0;
        }
        rear++;
        size++;
        if(rear == data.length){
            rear = 0;
        }
        data[rear] = element;
    }

    int dequeue(){
        if(front == -1){
            System.out.println("empty");
            return -1;
        }
        int temp = data[front];
        front++;
        size--;
        if(front == data.length){
            front = 0;
        }
        if(size == 0) {
            front = rear = -1;
        }
        return temp;
    }

    void print(){
        for(int i = front;i<= rear; i++){
            System.out.println(data[i]);
        }
    }
}

public class queue {
    public static void main(String[] args) {
        queueOpr q = new queueOpr(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.print();
        System.out.println("After dequeue");
        q.dequeue();
        q.dequeue();
        q.print();
    }
}
