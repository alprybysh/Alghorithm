package com.Sortirovka;


import javax.xml.soap.Node;
import java.util.Scanner;

/**
 * Created by alekspribysh on 1/28/16.
 */
public class BinaryTree {

    public static void main(String[] args) {
        new BinaryTree().run();
    }

    static class Node {
        Node left;

        Node right;

        int value;

        public Node(int value) {
            this.value = value;
        }
    }

    public void run() {
        // build the simple tree from chapter 11.
        Node root = new Node(10);
        System.out.println("Binary Tree Example");
        System.out.println("Building tree with root value " + root.value);
        insert(root, 1);
        insert(root, 8);
        insert(root, 6);
        insert(root, 3);
        insert(root, 9);
//        System.out.println("Traversing tree in order");
        printInOrder(root);
//        System.out.println("Traversing tree front-to-back from location 7");

    }

    public void insert(Node node, int value) {
        if (value < node.value) {
            if (node.left != null) {
                insert(node.left, value);
            } else {
                System.out.println("  Inserted " + value + " to left of "
                        + node.value);
                node.left = new Node(value);
            }
        } else if (value > node.value) {
            if (node.right != null) {
                insert(node.right, value);
            } else {
                System.out.println("  Inserted " + value + " to right of "
                        + node.value);
                node.right = new Node(value);
            }
        }
    }

    public void printInOrder(Node node) {
        if (node != null) {
            printInOrder(node.left);
            System.out.println("  Traversed " + node.value);
            printInOrder(node.right);
        }
    }


}
