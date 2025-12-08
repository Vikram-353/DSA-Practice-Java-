package BinaryTree.LowestCommonAncestor;

import BinaryTree.BuildTree;
import BinaryTree.TreeNode;

public class LowestCommonAncestor {
    public static void main(String[] args) {
        Integer[] arr = { 6, 2, 8, 0, 4, 7, 9, null, null, 3, 5 };
        TreeNode root = BuildTree.buildTree(arr);
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(8);
        System.out.println(lowestCommonAncestor(root, p, q).val);

    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        }

        if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        }

        return root;

    }
}
