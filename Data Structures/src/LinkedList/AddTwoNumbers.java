package LinkedList;

public class AddTwoNumbers {

    public static Node addTwoNumbers(Node l1, Node l2) {
        //Create a sentinel/dummy
        Node temp = new Node(0);
        Node curr = temp;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0){
            //in case you're adding l1: 1->2->null and l2: 1->2->3->null
            int x = (l1 == null) ? 0 : l1.data;
            int y = (l2 == null) ? 0 : l2.data;

            //Add the 2 nodes and the carry from the previous nodes
            int sum = x + y + carry;

            //The carry will always be 1 or 0
            carry = sum / 10;

            //create a new node next to the sentinel
            curr.next = new Node(sum % 10);
            curr = curr.next;

            //Traverse the lists
            if (l1 != null){
                l1 = l1.next;
            }

            if (l2 != null){
                l2 =l2.next;
            }

        }
        return temp.next;

    }

    public static void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
            LinkedList list = new LinkedList();
            LinkedList list2 = new LinkedList();

            list.addToTheLast(new Node(9));
            list.addToTheLast(new Node(9));
            list.addToTheLast(new Node(9));
            list.addToTheLast(new Node(9));
            list.addToTheLast(new Node(9));
            list.addToTheLast(new Node(9));
            list.addToTheLast(new Node(9));

            list2.addToTheLast(new Node(9));
            list2.addToTheLast(new Node(9));
            list2.addToTheLast(new Node(9));
            list2.addToTheLast(new Node(9));


            Node node = addTwoNumbers(list.head, list2.head);
            printList(node);
    }
}
