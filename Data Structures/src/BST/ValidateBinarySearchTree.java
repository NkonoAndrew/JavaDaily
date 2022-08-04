package BST;

import java.util.Stack;


public class ValidateBinarySearchTree {
    private static Integer prev;

    public static boolean isValidBST(LeetTreeNode root) {
        prev = null;
        return inorder(root);
    }

    private static boolean inorder(LeetTreeNode root) {
        if (root == null) {
            return true;
        }
        if (!inorder(root.left)) {
            return false;
        }
        if (prev != null && root.val <= prev) {
            return false;
        }
        prev = root.val;
        return inorder(root.right);
    }

    public static boolean isValidBSTIteration(LeetTreeNode root) {
        Stack<LeetTreeNode> stack = new Stack();
        double prev = - Double.MAX_VALUE;
        LeetTreeNode current = root;

        while (!stack.isEmpty() || current != null){
            //add all the left nodes to a stack
            while (current != null){
                stack.add(current);
                current = current.left;
            }
            //pop a left node from the stack
            current = stack.pop();
            if (current.val < prev) { //if the current element is less than the previous, initially a null, then flase
                return false;
            }
            prev = current.val; //make the previous the current and compare it with the next node
            current = current.right;
        }
        return true;
    }

    public static void main(String[] args) {
        LeetBST bst = new LeetBST();
        bst.insert(1);
        bst.insert(2);
        bst.insert(3);
        isValidBST(bst.root);
        System.out.println(isValidBSTIteration(bst.root));
        bst.inOrder();
    }
}
