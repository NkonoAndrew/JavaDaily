package DSI;

public class RemoveDuplicateLinkedList {
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

    public Node remove(Node head, int target){
        Node current = head;

        while (current != null && current.next != null){
            if (current.data == target && current.next.data == target){
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        RemoveDuplicateLinkedList list = new RemoveDuplicateLinkedList();
        list.addToLast(new Node(1));
        list.addToLast(new Node(1));
        list.addToLast(new Node(2));
        list.addToLast(new Node(3));
        list.addToLast(new Node(4));
        list.addToLast(new Node(5));
        list.printList(list.head);
        list.remove(list.head, 1);
        list.printList(list.head);


    }
}
