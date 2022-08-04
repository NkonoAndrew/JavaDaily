package BST;
//bottom up approach
public class MaximumDepthofBinaryTree {
    public static int maxDepth(TreeNode root) {
        if (root == null){
            return -1;
        } else {
            int left_height = maxDepth(root.left);
            int right_height = maxDepth(root.right);
            return Math.max(left_height, right_height) + 1;
        }
    }

    public static void main(String[] args) {
        BST<Integer> tree = new BST<Integer>();
        tree.insert(3);
        tree.insert(9);
        tree.insert(20);
        tree.insert(15);
        tree.insert(7);
        int depth = maxDepth(tree.root);
        System.out.println("The maximum depth is " + depth);
    }
}
