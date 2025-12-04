package BinaryTree.RightSideView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import BinaryTree.BuildTree;
import BinaryTree.TreeNode;

public class RightSideView {
    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 3, 4, null, null, null, 5 };
        TreeNode root = BuildTree.buildTree(arr);
        System.out.println(rightSideView(root));
    }

    public static List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        helper(root, 0, list);
        for (List<Integer> i : list) {
            result.add(i.getLast());
        }
        return result;
    }

    public static void helper(TreeNode node, int level, List<List<Integer>> result) {
        if (node == null) {
            return;
        }

        if (result.size() == level) {
            result.add(new ArrayList<>());
        }

        result.get(level).add(node.val);
        helper(node.left, level + 1, result);
        helper(node.right, level + 1, result);

    }
}
