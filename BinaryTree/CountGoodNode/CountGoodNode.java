package BinaryTree.CountGoodNode;

import BinaryTree.BuildTree;
import BinaryTree.TreeNode;

public class CountGoodNode {
    public static void main(String[] args) {
        Integer[] arr = { 3, 3, null, 4, 2 };
        TreeNode root = BuildTree.buildTree(arr);

        System.out.println(goodNodes(root));

    }

    public static int goodNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return helper(root, Integer.MIN_VALUE);

    }

    public static int helper(TreeNode node, int maxSoFar) {
        if (node == null) {
            return 0;
        }

        int count = 0;
        if (node.val >= maxSoFar) {
            count = 1;
            maxSoFar = node.val;
        }

        count += helper(node.left, maxSoFar);
        count += helper(node.right, maxSoFar);

        return count;
    }
}
