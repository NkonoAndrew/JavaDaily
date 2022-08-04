package DSI;

public class ReverseLinkedList {
    Node head;

    public void addToLast(Node node){
        if (head ==  null){
            head = node;
        } else {
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = node;
        }
    }

    public void printList(Node head){
        if (head == null){
            return;
        } else {
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        System.out.println();
    }


    public Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public Node reverseList(Node node) {
        if (node == null || node.next == null) {
            return node;
        }
        Node head = reverseList(node.next);
        node.next.next = node;
        node.next = null;
        return head;
    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.addToLast(new Node(1));
        list.addToLast(new Node(2));
        list.addToLast(new Node(3));
        list.addToLast(new Node(4));
        list.addToLast(new Node(5));
        list.printList(list.head);
//        list.reverse(list.head);
//        list.printList(list.head);
        list.reverseList(list.head);




    }
}
