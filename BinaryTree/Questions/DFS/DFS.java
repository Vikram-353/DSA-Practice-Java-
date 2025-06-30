package BinaryTree.Questions.DFS;

import java.util.*;

public class DFS {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(9, new TreeNode(7), new TreeNode(7)));

        DFS dfs = new DFS();
        int result = dfs.diameterOfBinaryTree(root);

        System.out.println(result);

    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    int maxDaimeter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return maxDaimeter - 1;
    }

    int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        int dia = leftHeight + rightHeight + 1;
        maxDaimeter = Math.max(maxDaimeter, dia);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode curr = root;
        while (curr != null) {
            if (curr.left != null) {
                TreeNode temp = curr.left;
                while (temp.right != null) {
                    temp = temp.right;
                }
                temp.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;

        }
    }

}
