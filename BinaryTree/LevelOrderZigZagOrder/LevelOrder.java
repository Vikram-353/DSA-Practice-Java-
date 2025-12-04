package BinaryTree.LevelOrderZigZagOrder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import BinaryTree.BuildTree;
import BinaryTree.TreeNode;

public class LevelOrder {
    public static void main(String[] args) {
        Integer[] arr = { 3, 9, 20, null, null, 15, 7 };
        TreeNode root = BuildTree.buildTree(arr);
        System.out.println(levelOrder(root));
        System.out.println(DFSTravese(root));

    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        helper(root, 0, result);
        for (int i = 0; i < result.size(); i++) {
            if (i % 2 != 0) {
                Collections.reverse(result.get(i));
            }
        }

        return result;

    }

    public static TreeNode helper(TreeNode node, int level, List<List<Integer>> result) {
        if (node == null) {
            return null;
        }
        int size = result.size();
        if (level == size) {
            result.add(new ArrayList<Integer>());
        }
        result.get(level).add(node.val);

        node.left = helper(node.left, level + 1, result);
        node.right = helper(node.right, level + 1, result);

        return node;

    }

    public static List<Integer> DFSTravese(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helperDFS(root, result);
        return result;
    }

    private static TreeNode helperDFS(TreeNode node, List<Integer> result) {
        if (node == null) {
            return null;
        }
        helperDFS(node.left, result);
        result.add(node.val);
        helperDFS(node.right, result);

        return node;
    }

}
