package com.dit.java.tree;
class Node
{
    int data;
    Node left, right;
  
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
  
public class kdis
{
    Node root;
    int sum = 0;
    void printKDistant(Node node, int k)
    {
        
        if (node == null|| k < 0 )
              //Base case
            return;
        if (k == 0)
        {
            System.out.print(node.data + " ");
            sum += node.data;
            return;
        }
       //recursively traversing
        printKDistant(node.left, k - 1);
        printKDistant(node.right, k - 1);
        // System.out.println(sum);
            
    }
   
    public static void main(String args[]) {
        kdis tree = new kdis();
         
        /* Constructed binary tree is
                1
              /   \
             2     3
            /  \   /
           4    5 8
        */
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(8);
  
        tree.printKDistant(tree.root, 1);
    }
}