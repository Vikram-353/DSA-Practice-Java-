package BinaryTree.AVLTrees;

class AVL {
    public class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public AVL() {

    }

    public int height() {
        return height(root);
    }

    private int height(Node node) {
        if (node == null) {
            return -1;

        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void display() {
        display(root, "Root Node:");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.getValue());

        display(node.left, "Left child of " + node.getValue() + " : ");
        display(node.right, "Right child of " + node.getValue() + " : ");
    }

    public void insert(int value) {
        root = insert(value, root);

    }

    private Node insert(int value, Node node) {

        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (value < node.value) {
            node.left = insert(value, node.left);
        }
        if (value > node.value) {
            node.right = insert(value, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return rotate(node);
        // return node;
    }

    private Node rotate(Node node) {
        if (height(node.left) - height(node.right) > 1) {
            // left heavy
            if (height(node.left.left) - height(node.left.right) > 0) {
                // left left case
                return rightRotate(node);
            }
            if (height(node.left.left) - height(node.left.right) < 0) {
                // left right case
                node.left = leftRotate(node.left);
                return rightRotate(node);

            }
        }
        if (height(node.left) - height(node.right) < -1) {
            // right heavy
            if (height(node.right.left) - height(node.right.right) < 0) {
                // left left case
                return leftRotate(node);
            }
            if (height(node.right.left) - height(node.right.right) > 0) {
                // left left case
                node.right = rightRotate(node.right);
                return leftRotate(node);

            }
        }

        return node;
    }

    public Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;
        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return c;
    }

    public Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;

        c.right = t;
        p.left = c;
        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return p;
    }

    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    public void populateSorted(int[] nums) {
        populateSorted(nums, 0, nums.length);
    }

    private void populateSorted(int[] nums, int start, int end) {
        if (start >= end) {
            return;

        }

        int mid = start + (end - start) / 2;

        this.insert(nums[mid]);
        populateSorted(nums, start, mid);
        populateSorted(nums, mid + 1, end);
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }

        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public static void main(String[] args) {
        AVL tree = new AVL();

        // for (int i = 0; i < 1000; i++) {
        // tree.insert(i);
        // }

        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8 };
        tree.populate(nums);
        tree.display();
        System.out.println(tree.height());

    }
}
