package BinaryTree;

// TreeNode as a reusable component
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode next;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public int getValue() {
        return val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right, TreeNode next) {
        this.val = val;
        this.left = left;
        this.right = right;
        this.next = next;
    }
}
