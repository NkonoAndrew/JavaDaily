package BST;
/*Given the root of a Binary Search Tree and a target number k,
return true if there exist two elements in the BST such that their sum is equal to the given target.
 */

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

//Input: root = [5,3,6,2,4,null,7], k = 9
//Output: true
public class TwoSumIVInputisaBST {

    public static boolean findTarget(LeetTreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        //return find(root, set, k);
        return find1(root, set, k);
    }

    //Remove an element, pp, from the front of the queuequeue.
    //Check if the element k-pk−p already exists in the setset. If so, return True.
    //Otherwise, add this element, pp to the setset. Further, add the right and the left child nodes of the current node to the back of the queuequeue.
    //Continue steps 1. to 3. till the queuequeue becomes empty.
    //Return false if the queuequeue becomes empty.
    public static boolean find1(LeetTreeNode root, Set <Integer> set, int target){
        LeetTreeNode current = root;
        Queue<LeetTreeNode> queue = new LinkedList<>();
        queue.add(current);

        while (!queue.isEmpty()){
            if (current != null){
                LeetTreeNode queueNode = queue.remove();

                if (set.contains(target - queueNode.val)){
                    return true;
                }

                set.add(queueNode.val);
                queue.add(current.left);
                queue.add(current.right);
            }
        }
        return false;
    }

    public static boolean find(LeetTreeNode root, Set<Integer> set, int target){
        LeetTreeNode current = root;
        if (current == null){
            return false;
        }

        if (set.contains(target - current.val)){
            return true;
        }
        set.add(current.val);
        return find(current.right, set, target) || find(current.left, set, target);
    }


    public static void main(String[] args) {
        LeetBST bst = new LeetBST();
        bst.insert(5);
        bst.insert(3);
        bst.insert(6);
        bst.insert(2);
        bst.insert(4);
        bst.insert(7);
        System.out.println(findTarget(bst.root, 50));
    }
}
