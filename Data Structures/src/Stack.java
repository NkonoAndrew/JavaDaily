/*
Implemented using arrays
 */
public class Stack {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        s.push(9);
        s.push(10);
        s.pop();
        s.pop();
        s.pop();

        s.print();
    }

    static final int MAX =  10;
    int[] array = new int[MAX];
    int top;

    Stack(){
        top = - 1;
    }

    //check if the stack is empty
    boolean isEmpty(){
        return (top < 0);
    }

    //add an item to the top of the array
    boolean push(int x){
        if (top >= MAX - 1){
            System.out.println("Stack oveflow!");
            return false;
        }
        else {
            array[++top] = x;
            System.out.println(x + " added to the stack");
            return true;

        }
    }

    public int pop(){
        if (top < 0){
            System.out.println("Stack underflow!");
            return 0;
        }
        else {
            int x = array[top--];
            System.out.println(x + "popped from the stack");
            return x;
        }

    }

    int peek(){
        if (top < 0){
            System.out.println("Stack underflow!");
            return 0;
        }
        else {
            int x = array[top];
            return x;
        }
    }

    void print(){
        for (int i = top; i >- 1 ; i--) {
            System.out.print(" " + array[i]);
        }
    }
}
