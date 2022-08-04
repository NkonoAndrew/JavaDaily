package BST;
import java.util.Iterator;

public class BST<E extends Comparable<E>> extends AbstractTree<E>{
    protected TreeNode<E> root;
    protected int size = 0;

    @Override
    public boolean search(E e) {
        if (root == null){
            return false;
        } else {
            TreeNode<E> current = root;

            while(current != null){
                if (e.compareTo(current.element) < 0){
                    current = current.left;
                } else if (e.compareTo(current.element) > 0){
                    current = current.right;
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean insert(E e) {
        if (root == null){
            root = createNewNode(e);
        } else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;

            while (current != null){
                if (e.compareTo(current.element) < 0){
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0){
                    parent = current;
                    current = current.right;
                } else {
                    return false;  //no duplicates
                }
            }

            if (e.compareTo(parent.element) < 0){
                parent.left = createNewNode(e);
            } else {
                parent.right = createNewNode(e);
            }
        }
        size++;
        return true;
    }

    public TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }

    @Override
    public boolean delete(E e) {
        TreeNode<E> current = root;
        TreeNode<E> parent = null;

        while (current != null){
            if (e.compareTo(current.element) < 0){
                parent = current;
                current = current.left;
            } else if (e.compareTo(current.element) > 0){
                parent = current;
                current = current.right;
            } else {
                break;
            }
        }
        if (current == null){ //e is not in the tree
            return false;
        }
        //If e has no children, then we simply remove it by modifying its parent to replace e with NIL as its child.
        if ((current.right == null) && (current.left == null)){
            parent.right = null;
            parent.left = null;
        }

        //Node is not a leaf and has a right child. Then the node could be replaced by its successor which is somewhere
        // lower in the right subtree. Then one could proceed down to delete the successor.
        size--;
        return true;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public void inorder() {
        inorder(root);
        System.out.println();
    }

    public void inorder(TreeNode<E> node){
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.element + " ");
        inorder(node.right);
    }

    public E treeMinimum(){
        TreeNode<E> current = root;

        while(current.left != null){
            current = current.left;
        }
        return current.element;
    }

    public E treeMaximum(){
        TreeNode<E> current = root;

        while (current.right != null){
            current = current.right;
        }
        return current.element;
    }

    //Successor = "after node", i.e. the next node, or the smallest node after the current one.
    //Successor of a node x is the node with the smallest key greater than x:key
    //ONE STEP RIGHT AND LEFT UNTIL YOU CANNOT ANYMORE
    public E successor(TreeNode<E> root) {
        root = root.right;
        while (root.left != null)
            root = root.left;
        return root.element;
    }

    //ONE STEP LEFT AND THEN RIGHT ALL THE WAY
    public E predecessor(TreeNode<E> root){
        root = root.left;

        while (root.right != null){
            root = root.right;
        }
        return root.element;
    }


}
