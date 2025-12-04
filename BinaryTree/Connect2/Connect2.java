package BinaryTree.Connect2;

import java.util.LinkedList;
import java.util.Queue;

import BinaryTree.BuildTree;
import BinaryTree.TreeNode;

public class Connect2 {
    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 3, 4, 5, null, 7 };
        TreeNode root = BuildTree.buildTree(arr);
        connect(root);
        display(root, "Root Node:");
    }

    private static void display(TreeNode node, String details) {
        if (node == null)
            return;

        System.out.println(details + node.getValue());

        if (node.next != null) {
            System.out.println(" -> Next of " + node.getValue() + ": " + node.next.getValue());
        } else {
            System.out.println(" -> Next of " + node.getValue() + ": null");
        }

        display(node.left, "Left child of " + node.getValue() + ": ");
        display(node.right, "Right child of " + node.getValue() + ": ");
    }

    public static TreeNode connect(TreeNode root) {
        if (root == null)
            return null;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            TreeNode prev = null;

            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();

                if (prev != null)
                    prev.next = curr;

                prev = curr;

                if (curr.left != null)
                    q.offer(curr.left);
                if (curr.right != null)
                    q.offer(curr.right);
            }
            prev.next = null;
        }
        return root;

    }
}
