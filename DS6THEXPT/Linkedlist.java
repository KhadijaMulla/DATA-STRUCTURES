import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class QueueLinkedList {
    Node front = null;
    Node rear = null;

    int size = 0;
    int capacity = 4;

    void enqueue(int x) {

        if (size == capacity) {
            System.out.println("Queue Overflow");
            display();   // show all elements
            return;
        }

        Node newNode = new Node(x);

        if (rear == null) {
            front = rear = newNode;
            size++;
            System.out.println("Inserted: " + x);
            return;
        }

        rear.next = newNode;
        rear = newNode;
        size++;

        System.out.println("Inserted: " + x);
    }

    void dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println("Deleted: " + front.data);
        front = front.next;
        size--;

        if (front == null)
            rear = null;
    }

    void display() {
        Node temp = front;
        System.out.print("Queue elements: ");

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

public class Linkedlist {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        QueueLinkedList q = new QueueLinkedList();

        while (true) {
            System.out.println("1 Insert");
            System.out.println("2 Delete");
            System.out.println("3 Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element: ");
                    int x = sc.nextInt();
                    q.enqueue(x);
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    return;
            }
        }
    }
}