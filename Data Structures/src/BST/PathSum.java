package BST;
//The treeNode in the BST implementation is an Object and this Leetcode problem uses ints.
public class PathSum {
//    public static boolean hasPathSum(TreeNode root, int targetSum) {
//
//        if (root == null){
//            return false;
//        }
//        else if (root.left == null && root.right == null && targetSum - root.element){
//            return true;
//        } else {
//            return hasPathSum(root.left, targetSum - root.element) || hasPathSum(root.right, targetSum - root.element)
//        }
//    }

    public boolean hasPathSumIterative(TreeNode root, int targetSum) {
        if (root == null){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        BST<Integer> bst = new BST<Integer>();
        bst.insert(5);
        bst.insert(4);
        bst.insert(8);
        bst.insert(11);
        bst.insert(13);
        bst.insert(4);
        bst.insert(7);
        bst.insert(2);
        bst.insert(1);
       // hasPathSum(bst.root, 22);
    }
}
