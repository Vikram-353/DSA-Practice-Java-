package BinaryTree.Custom_BT;

import java.util.Scanner;

class Custom_Binary_Tree {
    public Custom_Binary_Tree() {

    }

    private static class Node {
        int value;
        Node Right;
        Node Left;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    // insert elements

    public void populate(Scanner sc) {
        System.out.println("Enter the root node");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc, root);
    }

    private void populate(Scanner sc, Node node) {
        System.out.println("Do you want to enter left of " + node.value);
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("Enter the value of the left of " + node.value);
            int value = sc.nextInt();
            node.Left = new Node(value);
            populate(sc, node.Left);

        }
        System.out.println("Do you want to enter right of " + node.value);
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter the value of the right of " + node.value);
            int value = sc.nextInt();
            node.Right = new Node(value);
            populate(sc, node.Right);

        }
    }

    public void display() {
        display(root, " ");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.Left, indent + "\t");
        display(node.Right, indent + "\t");
    }

    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }

        prettyDisplay(node.Right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t");
            }
            System.out.println("|------>" + node.value);
        } else {
            System.out.println(node.value);
        }

        prettyDisplay(node.Left, level + 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Custom_Binary_Tree tree = new Custom_Binary_Tree();
        tree.populate(sc);
        tree.prettyDisplay();
    }

}
