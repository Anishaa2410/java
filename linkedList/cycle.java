package com.dit.java.linkedList;

class gen<T>{
    T data;
    gen<T> next;
    gen(T data){
        this.data=data;
        this.next = null;
    }
}

public class cycle<T> {
    private gen<T> start;

    gen<T> loop(){
        gen<T> slow,fast,temp =null;
        slow=fast= start;
        if(start != null){
            while(fast != null && fast.next != null){
                fast= fast.next.next;
                slow=slow.next;
                if(fast== slow){
                    System.out.println("Cycle present");
                    return slow;
                }
            }
            System.out.println("not present");
        }
        return temp;
    }

    void remove(){
        gen<T> p,q;
        q = loop();
        p = start;
        gen<T> prev=null ;
        while(p != q){
            p= p.next;
            prev = q;
            q = q.next;
            if(p == q){
                System.out.println("point is " +q.data +" "+prev.data);
                prev.next = null;    
            }
         }
          
    }

    void print(){
        gen<T> current = start;
        while(current != null){
            System.out.print(current.data + " ");
            current= current.next;
        }
    }

    public static void main(String[] args) {
        cycle<Integer> obj = new cycle<>();
        obj.start= new gen<Integer>(1);
        obj.start.next = new gen<Integer>(2);
        obj.start.next.next = new gen<Integer>(3);
        obj.start.next.next.next = new gen<Integer>(4);
        obj.start.next.next.next.next = new gen<Integer>(5);
        obj.start.next.next.next.next.next = new gen<Integer>(7);
        obj.start.next.next.next.next.next.next = new gen<Integer>(8);


        // creating loop
        obj.start.next.next.next.next.next =obj.start.next.next;
        obj.loop();
        // obj.print();
        obj.remove();
        obj.print();
    }
}
