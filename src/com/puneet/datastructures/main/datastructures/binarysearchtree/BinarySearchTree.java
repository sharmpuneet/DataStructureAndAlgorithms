package com.puneet.datastructures.main.datastructures.binarysearchtree;


import java.util.Stack;

public class BinarySearchTree {
    private Node root;

    public void insertNode(int key, String value) {
        Node newNode = new Node(key, value);
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;

            while (true) {
                parent = current;
                if (key <= current.key) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void displayTree() {
        Stack mainStack = new Stack();
        mainStack.push(root);
        int spaces = 32;
        boolean isRowEmpty = false;
        System.out.println("......................................................");

        while (!isRowEmpty) {
            Stack localStack = new Stack();
            isRowEmpty = true;
            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }

            while (!mainStack.isEmpty()) {
                Node temp = (Node) mainStack.pop();
                if (temp != null) {
                    System.out.print(temp.key);
                    localStack.push(temp.leftChild);
                    localStack.push(temp.rightChild);
                    if (temp.leftChild != null || temp.rightChild != null) {
                        isRowEmpty = false;
                    }
                } else {
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                }

                for (int j = 0; j < spaces * 2 - 2; j++) {
                    System.out.print(" ");
                }
            }

            System.out.println();
            spaces = spaces / 2;

            while (!localStack.isEmpty())
                mainStack.push(localStack.pop());
        }
        System.out.println("......................................................");
    }

    public Node findMin() {
        Node current = root;
        Node last = null;
        while (current != null) {
            last = current;
            current = current.leftChild;
        }
        return last;
    }

    public Node findMax() {
        Node current = root;
        Node last = null;
        while (current != null) {
            last = current;
            current = current.rightChild;
        }
        return last;
    }

    public boolean remove(int key) {
        Node currentNode = root;
        Node parentNode = root;
        boolean isLeftChild = false;

        // Search the node with the key to delete
        while (currentNode.key != key) {
            parentNode = currentNode;
            if (key <= currentNode.key) {
                isLeftChild = true;
                currentNode = currentNode.leftChild;
            } else {
                isLeftChild = false;
                currentNode = currentNode.rightChild;
            }
            if (currentNode == null) {
                return false;
            }
        }

        // found the node
        Node nodeToDelete = currentNode;

        // If node is a leaf
        if (nodeToDelete.leftChild == null && nodeToDelete.rightChild == null) {
            // if
            if (nodeToDelete == root) {
                root = null;
            } else if (isLeftChild) {
                parentNode.leftChild = null;
            } else {
                parentNode.rightChild = null;
            }
        } else if (nodeToDelete.rightChild == null) { // If node has one child that is on the left
            if (nodeToDelete == root) {
                root = nodeToDelete.leftChild;
            } else if (isLeftChild) {
                parentNode.leftChild = nodeToDelete.leftChild; // attach the subtree
            } else {
                parentNode.rightChild = nodeToDelete.leftChild; // attach the subtree
            }
        } else if (nodeToDelete.leftChild == null) { // If node has one child that is on the right
            if (nodeToDelete == root) {
                root = nodeToDelete.rightChild;
            } else if (isLeftChild) {
                parentNode.leftChild = nodeToDelete.rightChild;  // attach the subtree
            } else {
                parentNode.rightChild = nodeToDelete.rightChild; // attach the subtree
            }
        } else {
            // If node has 2 children

            // Get Node to delete successor
            Node successor = getSuccessor(nodeToDelete);

            // Connect parent of nodeToDelete to successor
            if (nodeToDelete == root) {
                root = successor;
            } else if (isLeftChild) {
                parentNode.leftChild = successor;
            } else {
                parentNode.rightChild = successor;
            }
            successor.leftChild = nodeToDelete.leftChild;
        }

        return true;
    }

    private Node getSuccessor(Node nodeToDelete) {
        Node successorParent = nodeToDelete;
        Node successor = nodeToDelete;

        Node current = nodeToDelete.rightChild; // go to the right child
        while (current != null) { // Find minimum i.e. traverse left until no left child left
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }

        // If successor is not a right child of node to delete i.e. the first item when we traversed
        if (successor != nodeToDelete.rightChild) {
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = nodeToDelete.rightChild;
        }
        return successor;
    }
}
