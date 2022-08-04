package BST;

public class Tester {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<Integer>();
        //45 55 57 59 60 67 100 101 107
        bst.insert(45);
        bst.insert(55);
        bst.insert(57);
        bst.insert(59);
        bst.insert(60);
        bst.insert(67);
        bst.insert(100);
        bst.insert(101);
        bst.insert(107);

        System.out.println(bst.delete(107));
        bst.inorder();

    }
}
