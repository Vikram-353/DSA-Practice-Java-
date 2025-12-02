package BinaryTree.IsSameTree;

import BinaryTree.BuildTree;
import BinaryTree.TreeNode;

public class IsSameTree {
    public static void main(String[] args) {
        Integer[] arr1 = { 1, 2, 3 };
        Integer[] arr2 = { 1, 1, 2 };
        TreeNode p = BuildTree.buildTree(arr1);
        TreeNode q = BuildTree.buildTree(arr2);
        System.out.println(isSameTree(p, q));

    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.left);
    }

}
