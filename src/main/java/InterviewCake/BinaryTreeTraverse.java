package InterviewCake;



import com.Sortirovka.BinaryTree;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeTraverse {
//    static class Node {
//        Node left;
//
//        Node right;
//
//        int value;
//
//        public Node(int value) {
//            this.value = value;
//        }
//    }


    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        int [] arr = {1, 2, 3, 4, 5, 6};



        BinaryTree.Node root = new BinaryTree.Node(10);

        for(int item : arr){

         tree.insert(root, 3);
        }
    }

//    public List<Integer> inorderTraversal(BinaryTree root) {
//        List < Integer > res = new ArrayList< >();
//        Stack< BinaryTree > stack = new Stack < > ();
//        BinaryTree curr = root;
//        while (curr != null || !stack.isEmpty()) {
//            while (curr != null) {
//                stack.push(curr);
//                curr = curr.left;
//            }
//            curr = stack.pop();
//            res.add(curr.val);
//            curr = curr.right;
//        }
//        return res;
//
//    }


}
