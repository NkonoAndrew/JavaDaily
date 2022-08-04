package DSI;

import java.security.PublicKey;

public class MergeSortedLinkedList {
    Node head;

    /* Method to insert a node at
   the end of the linked list */
    public void addToTheLast(Node node)
    {
        if (head == null)
        {
            head = node;
        }
        else
        {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }


    /* Method to print linked list */
    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node merge(Node l1, Node l2){
        Node temp = new Node(0);
        Node currentNode = temp;

        while (l1 != null && l2 != null){
            if (l1.data <= l2.data){
                currentNode.next = l1;
                l1 = l1.next;
            } else {
                currentNode.next = l2;
                l2 = l2.next;
            }
            currentNode = currentNode.next;
        }

        if (l1 != null){
            currentNode.next = l1;
            l1 = l1.next;
        }

        if (l2 != null){
            currentNode.next = l2;
            l2 = l2.next;
        }
        return temp.next;
    }


    public static void main(String[] args) {
        MergeSortedLinkedList llist1 = new MergeSortedLinkedList();
        MergeSortedLinkedList llist2 = new MergeSortedLinkedList();

        llist1.addToTheLast(new Node(5));
        llist1.addToTheLast(new Node(10));
        llist1.addToTheLast(new Node(15));

        llist2.addToTheLast(new Node(2));
        llist2.addToTheLast(new Node(3));
        llist2.addToTheLast(new Node(20));

        llist1.printList();
        llist2.printList();

        llist1.head = merge(llist1.head, llist2.head);
        llist1.printList();

    }


}
