package com.bridgelabz.bst;

public class BinarySearchMain {
    public static void main(String[] args)
    {
        BinarySearchTree tree = new BinarySearchTree();

        /* Let us create following BST
              56
           /     \
          30      70
         */

        tree.insert(56);
        tree.insert(30);
        tree.insert(70);


        // print inorder traversal of the BST
        tree.inorder();
    }
}
