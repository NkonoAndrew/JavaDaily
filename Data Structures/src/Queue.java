//Used in Breadth first search
public class Queue {
    int rear, front, size;
    int capacity;
    int[] array;

    public Queue(int capacity){
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        array = new int[this.capacity];
    }

    boolean isEmpty(Queue queue){
        return (queue.size == 0);
    }

    boolean isFull(Queue queue){
        return (queue.size == queue.capacity);
    }

    int dequeue(){
        if (isEmpty(this)){
            System.out.println("Queue empty!");
            return Integer.MIN_VALUE;
        }
        else {
            int item = this.array[this.front];
            this.front = (this.front + 1) % (this.capacity);
            this.size = this.size - 1;
            return item;
        }
    }

    //check if the queue is full
    //for the first element, set the value of front to 0
    //increase the rear index by 1
    //add the new element to the rear
    void enqueue(int item){
        if (isFull(this)){
            System.out.println("Queue full!");
        } else {
            this.rear = (this.rear + 1) % (this.capacity);
            this.array[this.rear] = item;
            this.size = this.size + 1;
            System.out.println(item + " added to queue");
        }
    }
    void getFront(){
        System.out.println("The front is " + this.array[this.front]);
    }

    void getRear(){
        System.out.println("The rear is " + this.array[this.rear]);
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.dequeue();

        queue.getFront();
        queue.getRear();


    }
}
