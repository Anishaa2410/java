package com.dit.java.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class BinaryTree<T>{
    T data;
    BinaryTree<T> left,right;
    BinaryTree(T data){
        this.data = data;
        left=null;
        right=null;
    }
    
}
public class crud {
    
    String msg = "root";
    Scanner scanner = new Scanner(System.in);

    BinaryTree<Integer> insert() {
        System.out.println("Enter the " + msg + " data or enter -1 to exit");
        int data = scanner.nextInt();
        if(data == -1) {
            return null;
        }
        BinaryTree<Integer> node = new BinaryTree<>(data);
        msg = "left";
        node.left = insert();
        msg = "right";
        node.right = insert();
        msg = "root";
        return node;
    }

    void print(BinaryTree<Integer> root) {
        if(root == null) {
            return;
        }
        System.out.println("When root is "+ root.data);
        String output = "";
        if(root.left != null) {
            output += "L : " + root.left.data + ", ";
        }
        if(root.right != null) {
            output += "R : " + root.right.data + ", ";
        }
        System.out.print(output);
        print(root.left);
        print(root.right);
    }

    // PLR - Parent Left Right
    void preOrder(BinaryTree<Integer> root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data+ " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // LRP
    void postOrder(BinaryTree<Integer> root) {

        if(root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+ " ");
    }

    // LPR
    void inOrder(BinaryTree<Integer> root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    //plr
    void preOrderIterative(BinaryTree<Integer> root) {
        // 1. Create Empty Stack & push root node into stack
        // 2. while stack is not empty
        //    - Pop an item from stack & print it
        //    - push right child of popped item into stack
        //    - push left child of popped item into stack
        if(root == null) {
            return;
        }
        Stack<BinaryTree<Integer>> st = new Stack<>();
        BinaryTree<Integer> current = root;
        while(current != null || st.isEmpty() == false) {
            if(st.isEmpty() == false && current == null) {
                current = st.pop();
            }
            System.out.print(current.data + " ");
            if(current.right != null) {
                st.push(current.right);
            }
            current = current.left;
        }
    }

    void inOrderIterative(BinaryTree<Integer> root) {
        // 1) Create an empty stack S. LPR
        // 2) Initialize current node as root
        // 3) Push the current node to S and set current = current->left until current is NULL
        // 4) If current is NULL and stack is not empty then 
        //      a) Pop the top item from stack.
        //      b) Print the popped item, set current = popped_item->right 
        //      c) Go to step 3.
        // 5) If current is NULL and stack is empty then we are done.
        if(root == null) {
            return;
        }
        Stack<BinaryTree<Integer>> s = new Stack<>();
        BinaryTree<Integer> curr = root;
        while(!s.isEmpty() || curr != null){
            while (curr !=  null)
            {
                s.push(curr);
                curr = curr.left;
            }
            if(curr == null && !s.isEmpty()){
                curr = s.pop();
                System.out.print(curr.data+ " ");
                curr = curr.right;
            }
        }
    }

    void postOrderIterative(BinaryTree<Integer> root) {
        // 1. Push root to first stack.  LRP
        // 2. Loop while first stack is not empty
        //    2.1 Pop a node from first stack and push it to second stack
        //    2.2 Push left and right children of the popped node to first stack
        // 3. Print contents of second stack
        
        if(root == null) {
            return;
        }
        Stack<BinaryTree<Integer>> s1 = new Stack<>();
        Stack<BinaryTree<Integer>> s2 = new Stack<>();
        BinaryTree<Integer> curr = root;
        s1.push(curr);
        while(!s1.isEmpty()){
            curr = s1.pop();
            s2.push(curr);
            if (curr.left != null)
                s1.push(curr.left);
            if (curr.right != null)
                s1.push(curr.right);
        }
        while (!s2.isEmpty()) {
            BinaryTree<Integer> temp = s2.pop();
            System.out.print(temp.data + " ");
        }
        
    }

    void level(BinaryTree<Integer> root){
        if(root == null) {
            return;
        }
        Queue<BinaryTree<Integer>> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            BinaryTree<Integer> curr = q.remove();
            
            if(curr == null){
                System.out.println();
                if(!q.isEmpty()){
                    q.add(null);
                }
                else{
                    break;
                }
            }
            else{
                System.out.print(curr.data+" ");
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
    }

    static int count(BinaryTree<Integer> root){
        if(root == null){
            return 0;
        }
        int left  = count(root.left);
        int right = count(root.right);
        return left+right+1;
    }

    static int sum(BinaryTree<Integer> root){
        if(root == null){
            return 0;
        }
        int left  = sum(root.left);
        int right = sum(root.right);
        return left+right+root.data;
    }


    static int height(BinaryTree<Integer> root){
        if(root == null){
            return 0;
        }
        int left  = height(root.left);
        int right = height(root.right);
        int h = Math.max(left, right);
        return h+1;
    }

    static int max(BinaryTree<Integer> root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        else {
            return Math.max(root.data, Math.max(max(root.left), 
            max(root.right)));
        }
    }

    static int diameter(BinaryTree<Integer> root){
        //case 1: dia passes through root
        // case 2: dia doesnt pass through root(left/right subtree)
        //O(n2)
        if(root == null){
            return 0;
        }
        int left  = diameter(root.left);
        int right = diameter(root.right);
        int dia3 = height(root.left) + height(root.right)+1; //when passing through root

        return Math.max(dia3, Math.max(left,right));
    }

    public static void main(String[] args) {
        crud tree = new crud();
        BinaryTree<Integer> root = tree.insert();
        tree.print(root);
        System.out.println("Pre Order Traversal...");
        tree.preOrder(root);
        System.out.println("\n iterative pre");
        tree.preOrderIterative(root);
        System.out.println("\n inorder");
        tree.inOrder(root);
        System.out.println(" \n iterative in");
        tree.inOrderIterative(root);
        System.out.println("\n postorder");
        tree.postOrder(root);
        System.out.println("\n iterative post");
        tree.postOrderIterative(root);
        System.out.println("\n Level");
        tree.level(root);
        System.out.println("Nodes present : "+count(root));
        System.out.println("Sum of nodes is : "+sum(root));
        System.out.println("height of nodes is : "+height(root));
        System.out.println("max of nodes is : "+max(root));

    }
}
