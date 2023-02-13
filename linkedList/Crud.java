package com.dit.java.linkedList;

class gen<T>{
    T data;
    gen<T> next;
    gen(T data){
        this.data=data;
        this.next = null;
    }
}
public class Crud<T> {
    private gen<T> start;

    void insert_beg(gen<T> node){
        if(start == null){
            start = node;
            return;
        }
        node.next = start;
        start = node;
    }

    void ins_end(gen<T> node){
        if(start == null){
            start = node;
            return;
        }
        gen<T> curr = start;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = node;
    }

    void ins_mid(gen<T> node, int pos){
        if(start == null){
            start = node;
            return;
        }
        if(pos> 0){
            gen<T> temp= start;
        int i =1;
        while(i<pos){
            temp = temp.next;
            i++;
        }
        node.next= temp.next;
        temp.next= node;
        }
    }

    void del(int pos){
        if(start == null){
            System.out.println("Empty list");
            return;
        }
        gen<T> temp = null;
        if(pos>0){
            temp = start;
            int i = 1;
            while(i<pos){
                temp = temp.next;
                i++;
            }
            temp.next = temp.next.next;
        }
        if(pos==0){
            temp = start.next;
            start= temp;
            return;
        }   
    }

    void mid(){
        gen<T> fast,slow;
        if(start == null){
            System.out.println("Empty ");
        }
        if( start != null){
            fast = slow = start;
            while(fast != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
            }
            System.out.println("mid point is : " +slow.data);
        }
    }

    void nth_ele(int pos){
        gen<T> p,q;
        p=q=start;
        for(int i =1; i <= pos; i++){
            q= q.next;
        }
        while(q != null){
            q= q.next;
            p= p.next;
        }
        System.out.println(pos +"th element from end is " + p.data);
    }

    void rev(){
        if(start == null){
            System.out.println("empty");
        }
        if(start.next == null){
            System.out.println("one node only !");
        }
        gen<T> cur = start, prev = null;
        while(cur != null){
            gen<T> next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        start = prev;
    }
    void print(){
        gen<T> current = start;
        while(current != null){
            System.out.print(current.data + " ");
            current= current.next;
        }
    }

    public static void main(String[] args) {
        Crud<Integer> obj = new Crud<>();
        obj.insert_beg(new gen<Integer>(3));
        obj.insert_beg(new gen<Integer>(2));
        obj.insert_beg(new gen<Integer>(1));
        obj.insert_beg(new gen<Integer>(0));
        obj.ins_end(new gen<Integer>(4));
        obj.ins_mid(new gen<Integer>(5) , 2);
        obj.mid();
        obj.nth_ele(4);
        obj.print();
        System.out.println("after reversing");
        obj.rev();
        obj.print();
        System.out.println();
        System.out.println();

        obj.del(1);
        System.out.println("AFTER DELETING POSITION 1");
        obj.print();
        obj.rev();
        System.out.println("after reversing again");
        obj.print();
        System.out.println();
        obj.mid();
        
    }
}
