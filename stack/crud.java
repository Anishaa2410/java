package com.dit.java.stack;

import java.util.ArrayList;

class Stack<T>{
    int top,capacity;
    ArrayList<T> arr;
    Stack(int capacity){
        this.capacity = capacity;
        top = -1;
        arr = new ArrayList<>();
    }

    void push(T ele){
        if(getSize() == capacity  - 1) {
            throw new RuntimeException("Stack is full...");
        }
        System.out.println("Pushed " +ele);
        top++;
        arr.add(top, ele);
    }

    T pop(){
        if(isEmpty()){
            throw new RuntimeException("Empty stack...");
        }
        T element = arr.remove(top);
        System.out.println("Poped "+element);
        top--;
        return element;
    }
    void peek(){
        System.out.println(arr.get(top) + " is on top of stack!");
    }

    boolean isEmpty() {
        return (top == -1);
    }

    int getSize() {
        return top;
    }

    void print() {
        for(T e : arr) {
            System.out.print(e + " ");
        }
        System.out.println("\n==================");
    }
}
public class crud {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>(5);
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");
        stack.print();
        for(int i = 3;i>0;i--){
            stack.pop();
            stack.peek();
        }
        stack.print();
        
    }
    
}
