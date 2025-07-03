package BinaryTree.Questions.DFS;

import java.util.Arrays;

public class DFS {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(9, new TreeNode(7), new TreeNode(7)));

        DFS dfs = new DFS();
        int result = dfs.diameterOfBinaryTree(root);

        System.out.println(result);
        int[] arr = { 3, 9 };
        System.out.println(dfs.isValidBST(root));
        System.out.println(dfs.kthSmallest(root, 1));
        System.out.println(dfs.sumNumbers(root));
        System.out.println(dfs.maxPathSum(root));
        System.out.println(dfs.validPath(root, arr));

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

    public boolean isValidBST(TreeNode root) {

        return helper(root, null, null);
    }

    public boolean helper(TreeNode node, Integer low, Integer high) {
        if (node == null) {
            return true;
        }

        if (low != null && low >= node.val) {
            return false;
        }
        if (high != null && high <= node.val) {
            return false;

        }

        boolean left = helper(node, low, node.val);
        boolean right = helper(node, node.val, high);

        return left && right;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }

        if (root == p || root == q) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        if (left == null) {
            return right;
        } else {
            return left;
        }
    }

    public int kthSmallest(TreeNode root, int k) {
        return helper(root, k).val;
    }

    int count = 0;

    public TreeNode helper(TreeNode root, int k) {
        if (root == null) {
            return null;
        }

        TreeNode left = helper(root.left, k);

        if (left != null) {
            return left;
        }
        count++;
        if (count == k) {
            return root;
        }

        return helper(root.right, k);

    }

    // public TreeNode buildTree(int[] preorder, int[] inorder) {
    // if (preorder.length == 0) {
    // return null;
    // }

    // int r = preorder[0];
    // int index = 0;

    // for (int i = 0; i < inorder.length; i++) {
    // if (inorder[i] == r) {
    // TreeNode node = new TreeNode(r);
    // }

    // node.left = buildTree(Arrays.copyOfRange(preorder, 1, index + 1),
    // Arrays.copyOfRange(inorder, 0, index));
    // node.right = buildTree(Arrays.copyOfRange(preorder, index + 1,
    // preorder.length),
    // Arrays.copyOfRange(inorder, index + 1, inorder.length));
    // }
    // }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.val == targetSum && root.left == null && root.right == null) {
            return true;
        }

        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);

    }

    public int sumNumbers(TreeNode root) {
        return helperSum(root, 0);
    }

    private int helperSum(TreeNode node, int sum) {
        if (node == null) {
            return 0;
        }
        sum = sum * 10 + node.val;

        if (node.left == null && node.right == null) {
            return sum;
        }

        return helperSum(node.left, sum) + helperSum(node.right, sum);
    }

    int ans = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        helperPath(root);
        return ans;
    }

    private int helperPath(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = helperPath(node.left);
        int right = helperPath(node.right);

        left = Math.max(0, left);
        right = Math.max(0, right);

        int pathSum = left + right + node.val;

        ans = Math.max(ans, pathSum);
        return Math.max(left, right) + node.val;

    }

    public boolean validPath(TreeNode node, int[] arr) {
        return helperPathValid(node, arr, 0);
    }

    boolean helperPathValid(TreeNode node, int[] arr, int i) {
        if (node == null) {
            return false;
        }

        if (arr[i] == node.val) {
            return true;
        }

        validPath(node.left, arr);
        validPath(node.right, arr);
        return false;
    }

}
