package com.dit.java.tree;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data = data;
    }
}
public class BST {
    static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root; 
        }
        if(root.data> val){
            root.left = insert(root.left, val);
        }
        if(root.data < val){
            root.right = insert(root.right,val);
        }
        return root;
    } 
    static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    static boolean search(Node root, int key){ //O(H)
        if(root == null){
            return false;
        }
        else if(root.data > key){
            //check left subtree
            return search(root.left,key);
        }
        else if(root.data == key){
            return true;
        }
        else {
            return search(root.right,key);
        }
    }

    static Node del(Node root, int val){
        //case1 : node is leaf node, replace it with null
        //case2 : node has single child, del it and attach the child to root
        //case3 : node has 2 children, replace with inorder successor and del inorder succ
        //inorder : left most in right subtree

        if(root.data > val){
            root.left = del(root.left,val);
        }
        if(root.data < val){
            root.right = del(root.right,val);
        }
        else{
            //found val

            //case1
            if(root.left == null && root.right == null){
                return null;
            }
            //case2
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            //case3
            Node IS = inSuccessor(root.right);
            root.data = IS.data;
            root.right = del(root.right, IS.data);
        }
        return root;
    }

    static Node inSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int[] val = {5,1,3,4,2,7};
        Node root = null;
        for(int i =0;i<val.length;i++){
            root = insert(root,val[i]);
        }
        inorder(root);
        System.out.println();
        if(search(root,5)){
            System.out.println("Found!");
        }
        else{
            System.out.println("Not found");
        }
        del(root,5);
        inorder(root);
    }
}
