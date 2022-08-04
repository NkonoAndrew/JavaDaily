package BST;

//Implemented tree takes only unique elements
public class isSymmetric {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<Integer>();
        bst.insert(1);
        bst.insert(2);
        bst.insert(2);
        bst.insert(3);
        bst.insert(4);
        bst.insert(4);
        bst.insert(3);
        System.out.println(isSymmetric(bst.root));
    }

    private static boolean isSymmetric(TreeNode root) {
        if (root == null){
            return true;
        }
        return isMirror(root.left, root.right);
    }
     public static boolean isMirror(TreeNode left, TreeNode right){
        if (left == null && right == null){
            return true;
        }
        if (left.element != right.element){
            return false;
        }
        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
     }
}
