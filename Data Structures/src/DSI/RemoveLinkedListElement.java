package DSI;
//Input: head = [7,7,7,7], val = 7
//Output: []

//Input: head = [1,2,6,3,4,5,6], val = 6
//Output: [1,2,3,4,5]

//Input: head = [], val = 1
//Output: []
public class RemoveLinkedListElement {
    Node head;

    public void addToTheLast(Node node) {
        if (head == null){
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void printList(Node head){
        if (head == null){

        } else {
            Node temp = head;

            while (temp != null){
                System.out.print(temp.data);
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static Node removeElements(Node head, int val) {
        if (head == null){
            return null;
        }
        Node sentinel = new Node(0);
        sentinel.next = head;

        Node prev = sentinel;
        Node current = head;

        while (current != null){
            if (current.data == val){
                prev.next = current.next;
            } else {
                prev = current;
            }
            current = current.next;
        }
        return sentinel.next;

    }

    public static void main(String[] args) {
        RemoveLinkedListElement list = new RemoveLinkedListElement();

        list.addToTheLast(new Node(1));
        list.addToTheLast(new Node(2));
        list.addToTheLast(new Node(3));
        list.addToTheLast(new Node(6));
        list.addToTheLast(new Node(4));
        list.addToTheLast(new Node(5));
        list.addToTheLast(new Node(6));

        list.printList(list.head);

        list.head = removeElements(list.head, 6);
        list.printList(list.head);
    }
}
