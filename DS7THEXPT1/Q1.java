

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


class Stack {
    Node top;

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data + " pushed into stack");
    }

    void pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println(top.data + " popped from stack");
        top = top.next;
    }

    void display() {
        Node temp = top;
        System.out.print("Stack: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}


class Queue {
    Node front, rear;

    void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println(data + " inserted into queue");
    }

    void dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println(front.data + " deleted from queue");
        front = front.next;

        if (front == null) {
            rear = null;
        }
    }

    void display() {
        Node temp = front;
        System.out.print("Queue: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Q1 {
    public static void main(String[] args) {

        // STACK OPERATIONS
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.pop();
        s.display();

        // QUEUE OPERATIONS
        Queue q = new Queue();
        q.enqueue(100);
        q.enqueue(200);
        q.enqueue(300);
        q.display();
        q.dequeue();
        q.display();
    }
}
