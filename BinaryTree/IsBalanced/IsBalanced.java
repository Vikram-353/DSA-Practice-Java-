package BinaryTree.IsBalanced;

import BinaryTree.BuildTree;
import BinaryTree.TreeNode;

public class IsBalanced {
    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 2, 3, 3, null, null, 4, 4 };
        TreeNode root = BuildTree.buildTree(arr);

        System.out.println(isBalanced(root));

    }

    public static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        int left = height(root.left);
        int right = height(root.right);
        if (Math.abs(right - left) > 1) {
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);
    }

    private static int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = height(node.left);
        int right = height(node.right);

        return Math.max(left, right) + 1;
    }
}
