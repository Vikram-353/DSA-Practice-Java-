package BinaryTree.IsBalanced;

import BinaryTree.BuildTree;
import BinaryTree.TreeNode;

public class IsBalanced {
    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 2, 3, 4, 4, 3 };
        TreeNode root = BuildTree.buildTree(arr);

        // System.out.println(isBalanced(root));
        System.out.println(isSymmetric(root));

    }

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);

    }

    public static boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }

        return (left.val == right.val) && isMirror(left.left, right.right) && isMirror(left.right, right.left);

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
