import java.util.Scanner;

class QueueDequeue {

    int front = -1;
    int rear = -1;
    int size = 5;
    int queue[] = new int[size];

    void insert(int value) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            queue[rear] = value;
            System.out.println(value + " inserted into queue");
        }
    }

    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println(queue[front] + " deleted from queue");
            front++;
        }
    }

    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Queue elements are:");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        QueueDequeue q = new QueueDequeue();
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number of elements to insert: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            int value = sc.nextInt();
            q.insert(value);
        }

        q.display();

        System.out.println("Performing Dequeue...");
        q.dequeue();

        q.display();
    }
}