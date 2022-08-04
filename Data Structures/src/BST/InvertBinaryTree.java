package BST;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {
    public static void inorder(TreeNode node){
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.element + " ");
        inorder(node.right);
    }

    public static TreeNode invertTree(TreeNode root) {
        if (root != null){
            TreeNode left = invertTree(root.left);
            TreeNode right = invertTree(root.right);
            root.left = right;
            root.right = left;
        }
        return root;
    }

    public static TreeNode invertTreeIterative(TreeNode root) {
        if (root == null){
            return root;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            TreeNode current = queue.poll();
            TreeNode temp = current.left;
            current.left = current.right;
            current.right = temp;

            if (current.right != null){
                queue.add(current.right);
            }

            if (current.left != null){
                queue.add(current.left);
            }
        }

        return root;
    }

    public static void main(String[] args) {
        BST<Integer> tree = new BST<Integer>();
        tree.insert(3);
        tree.insert(9);
        tree.insert(20);
        tree.insert(15);
        tree.insert(7);
        tree.inorder();
        TreeNode node = invertTree(tree.root);
    }
}
