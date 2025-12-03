package BinaryTree.RemoveLeaves;

import java.util.ArrayList;
import java.util.List;

import BinaryTree.BuildTree;
import BinaryTree.TreeNode;

public class RemoveLeaves {
    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 2, 3, 4, 4, 3 };
        TreeNode root = BuildTree.buildTree(arr);

        // System.out.println(isBalanced(root));
        System.out.println(removeLeaves(root));
    }

    public static List<List<Integer>> removeLeaves(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        while (root != null) {
            List<Integer> leaves = new ArrayList<>();
            root = helper(root, leaves);
            result.add(leaves);
        }
        return result;
    }

    public static TreeNode helper(TreeNode root, List<Integer> leaves) {
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            leaves.add(root.val);
            return null;
        }

        root.left = helper(root.left, leaves);
        root.right = helper(root.right, leaves);

        return root;
    }

}
