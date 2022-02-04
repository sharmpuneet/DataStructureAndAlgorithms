package com.puneet.datastructures.main.datastructures.binarysearchtree;

public class Application {

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insertNode(10, "ten");
        binarySearchTree.insertNode(20, "twenty");
        binarySearchTree.insertNode(15, "fifteen");
        binarySearchTree.insertNode(12, "twelve");
        binarySearchTree.insertNode(12, "twelve");
        binarySearchTree.insertNode(21, "twentyOne");
        binarySearchTree.insertNode(30, "thirty");

        System.out.println(binarySearchTree.findMin().key);
        System.out.println(binarySearchTree.findMax().key);

        System.out.println(binarySearchTree.remove(10));
        System.out.println(binarySearchTree.findMin().key);
        binarySearchTree.insertNode(50, "fifty");

        binarySearchTree.displayTree();
    }
}
