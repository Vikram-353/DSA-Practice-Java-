package BinaryTree.Questions.Traversal;

import java.util.ArrayList;
import java.util.List;

import BinaryTree.BuildTree;
import BinaryTree.TreeNode;

public class Inorder {

    // Function to print tree in inorder
    public static void inorderPrint(TreeNode root) {
        if (root == null)
            return;

        inorderPrint(root.left); // visit left subtree
        System.out.print(root.val + " "); // visit root
        inorderPrint(root.right); // visit right subtree
    }

    public static void main(String[] args) {
        // System.out.println(pathSum(t1, 22));
        Integer[] arr = { 5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1 };
        TreeNode root = BuildTree.buildTree(arr);
        int targetSum = 22;

        List<List<Integer>> paths = pathSum(root, targetSum);
        System.out.println(paths);

    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorderHelper(root, list);
        return list;
    }

    public static void inorderHelper(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        inorderHelper(root.left, list);
        list.add(root.val);
        inorderHelper(root.right, list);

    }

    public static void hasPathSum(TreeNode root, int targetSum, List<Integer> innerList,
            List<List<Integer>> outerList) {
        if (root == null) {
            return;
        }
        innerList.add(root.val);
        if (root.val == targetSum && root.left == null && root.right == null) {
            outerList.add(new ArrayList<>(innerList));
        } else {
            hasPathSum(root.left, targetSum - root.val, innerList, outerList);
            hasPathSum(root.right, targetSum - root.val, innerList, outerList);
        }
        innerList.remove(innerList.size() - 1);

    }

    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> outerList = new ArrayList<>();
        List<Integer> innerList = new ArrayList<>();

        hasPathSum(root, targetSum, innerList, outerList);
        return outerList;
    }

}
