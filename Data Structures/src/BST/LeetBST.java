package BST;

public class LeetBST {
    LeetTreeNode root;

    LeetBST(){
        root = null;
    }

    LeetBST(int val){
        root = new LeetTreeNode(val);
    }
    // This method mainly calls insertRec()
    public void insert(int key){
         root = insertIntoBST(root, key);
    }

    public static LeetTreeNode insertIntoBST(LeetTreeNode root, int val) {
        LeetTreeNode cur;
        cur = root;
        if (cur == null) {
            cur = new LeetTreeNode(val);
            return cur;
        } else {
            if (val < cur.val){
                cur.left = insertIntoBST(cur.left, val);
            } else {
                cur.right = insertIntoBST(cur.right, val);
            }
        }
        return cur;
    }

    public void inOrder(){
        inorderRec(root);
    }

    void inorderRec(LeetTreeNode root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.val + " ");
            inorderRec(root.right);
        }
    }


}
