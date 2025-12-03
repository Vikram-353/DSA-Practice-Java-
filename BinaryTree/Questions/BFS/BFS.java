package BinaryTree.Questions.BFS;

import java.util.*;

public class BFS {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(9, new TreeNode(7), new TreeNode(7)));

        BFS bfs = new BFS();
        List<List<Integer>> result = bfs.levelOrder(root);

        System.out.println(result);

        System.out.println(findSuccessor(root, 9).val);

        List<List<Integer>> result2 = bfs.zigzagLevelOrder(root);
        // List<Integer> result3 = bfs.rightSideView(root);
        boolean result3 = bfs.isSymmetric(root);
        System.out.println(result2);
        System.out.println(result3);
        boolean result4 = findTarget(root, 14);
        System.out.println(result4);

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

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }
        boolean flag = false;

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> levelList = new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                levelList.add(currentNode.val);
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);

                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);

                }
            }

            if (!flag) {
                result.add(levelList);

            } else {
                result.add(levelList.reversed());

            }
            flag = !flag;

        }

        return result;

    }

    public static TreeNode findSuccessor(TreeNode root, int key) {

        if (root == null) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
            if (currentNode.left != null) {
                queue.offer(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.offer(currentNode.right);
            }
            if (currentNode.val == key) {
                break;

            }

        }

        return queue.peek();

    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        boolean flag = false;

        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> levelList = new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {
                if (!flag) {
                    TreeNode currentNode = queue.pollFirst();
                    levelList.add(currentNode.val);
                    if (currentNode.left != null) {
                        queue.addLast(currentNode.left);

                    }
                    if (currentNode.right != null) {
                        queue.addLast(currentNode.right);

                    }
                } else {
                    TreeNode currentNode = queue.pollLast();
                    levelList.add(currentNode.val);
                    if (currentNode.right != null) {
                        queue.addFirst(currentNode.right);

                    }
                    if (currentNode.left != null) {
                        queue.addFirst(currentNode.left);

                    }

                }

            }
            flag = !flag;

            result.add(levelList);

        }

        return result;
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> levelList = new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                levelList.add(currentNode.val);
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);

                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);

                }
            }

            result.add(levelList.getLast());

        }

        return result;

    }

    public boolean isSymmetric(TreeNode root) {
        // List<Integer> result = new ArrayList<>();

        if (root == null) {
            return true;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);

        while (!queue.isEmpty()) {
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();

            if (left == null && right == null) {
                continue;
            }
            if (left == null || right == null) {
                return false;
            }
            if (left.val != right.val) {
                return false;
            }

            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);

        }
        return true;

    }

    // Two Sum
    // return true if there are two numbers which sums to k
    public static boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<>();
        return helperTwoSum(root, k, set);

    }

    public static boolean helperTwoSum(TreeNode node, int k, HashSet<Integer> set) {
        if (node == null) {
            return false;
        }

        if (set.contains(k - node.val)) {
            return true;
        }

        set.add(node.val);
        return helperTwoSum(node.left, k, set) || helperTwoSum(node.right, k, set);
    }

}
