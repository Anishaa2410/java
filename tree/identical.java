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
class identical
{
    Node root1, root2;
  
    /* Given two trees, return true if they are
       structurally identical */
       public boolean identicalT(Node a, Node b) {
        if(a== null && b == null){
            return true;
        }
        if(a != null && b!= null){
            return (a.data==b.data && identicalT(a.left,b.left) && identicalT(a.right, b.right));
        }
        return false;
    }
 
  
    /* Driver program to test identicalTrees() function */
    public static void main(String[] args)
    {
        identical tree = new identical();
  
        tree.root1 = new Node(1);
        tree.root1.left = new Node(2);
        tree.root1.right = new Node(3);
        tree.root1.left.left = new Node(4);
        tree.root1.left.right = new Node(5);
  
        tree.root2 = new Node(1);
        tree.root2.left = new Node(2);
        tree.root2.right = new Node(3);
        tree.root2.left.left = new Node(4);
        tree.root2.left.right = new Node(7);
  
        if (tree.identicalT(tree.root1, tree.root2))
            System.out.println("Both trees are identical");
        else
            System.out.println("Trees are not identical");
  
    }
}
 
