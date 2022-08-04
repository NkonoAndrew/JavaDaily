package BST;

import java.util.*;

public class BinaryTreeLevelOrderTraversal {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null){
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < size ; i++) {
                TreeNode<Integer> current = queue.remove();
                currentLevel.add(current.element);
                if (current.left != null){
                    queue.add(current.left);
                }
                if (current.right != null){
                    queue.add(current.right);
                }
            }
            list.add(currentLevel);
        }
        return list;
    }
    public static void main(String[] args) {
        BST<Integer> bst = new BST<Integer>();
        bst.insert(3);
        bst.insert(9);
        bst.insert(20);
        bst.insert(15);
        bst.insert(7);
        List<List<Integer>> list = levelOrder(bst.root);

        Iterator itr = list.iterator();
        while(itr.hasNext())
        {
            Object obj = itr.next();
            System.out.print(obj);
        }
    }
}
