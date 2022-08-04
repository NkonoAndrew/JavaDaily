package DSI;
//Finish circular linked lists first
public class LinkedListCycle {

    private Node last;
    private int length;

    public static class Node {
       int data;
       Node next;

       Node(int d) {
           data = d;
           next = null;
      }
      Node(){

      }
    }

    public LinkedListCycle(){
        last = null;
        length = 0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void createCircularLinkedList(){
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        last = fourth;
    }

    public void display() {
        if(last == null) {
            return;
        }

        Node first = last.next;
        while(first != last) {
            System.out.print(first.data + " --> ");
            first = first.next;
        }
        System.out.println(first.data);
    }


    public boolean hasCycle() {
        if(last == null) {
            return false;
        }
        Node slow = last.next;  //this is the head
        Node fast = last.next.next; //this is next of head

        while (fast != null && slow != null){
            if (fast == slow){
                return true;
            }
            fast = fast.next.next;
            slow = slow.next;
        }

        return false;
    }
    public static void main(String[] args) {
        LinkedListCycle listCycle = new LinkedListCycle();
        listCycle.createCircularLinkedList();
        listCycle.display();
        System.out.println(listCycle.hasCycle());

    }
}
