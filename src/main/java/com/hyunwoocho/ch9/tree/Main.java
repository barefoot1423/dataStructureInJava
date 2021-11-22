package com.hyunwoocho.ch9.tree;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insertBST('G');
        bst.insertBST('I');
        bst.insertBST('H');
        bst.insertBST('D');
        bst.insertBST('B');
        bst.insertBST('M');
        bst.insertBST('N');
        bst.insertBST('A');
        bst.insertBST('J');
        bst.insertBST('E');
        bst.insertBST('Q');


        bst.printBST();
    }

}
