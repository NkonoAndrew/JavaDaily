package DSI;

import java.util.Stack;

public class QueueWithStack {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    public QueueWithStack() {

    }

    public void push(int x) {
        //Move elements from s1 to s2;
        while(!s1.empty()){
            s2.push(s1.pop());
        }

        //add the new element to s1
        s1.push(x);

        //move everything from s2 back to s1
        while (!s2.empty()){
            s1.push(s2.pop());
        }
    }

    public int pop() {
        //check if both stacks are empty

        if (s1.empty()){
            System.out.println("Queue is empty");
        }
        int x = s1.peek();
        s1.pop();
        return x;
    }

    public int peek() {
        if (s1.empty()){
            System.out.println("Queue is empty");
        }
        int x = s1.peek();
        return x;
    }

    public boolean empty() {
        if (s1.empty() && s2.empty()){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        QueueWithStack queue = new QueueWithStack();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
    }
}
