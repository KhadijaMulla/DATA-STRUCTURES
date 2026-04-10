import java.util.Scanner;

class QueueArray {
    int arr[];
    int front = -1;
    int rear = -1;
    int size;

    QueueArray(int size) {
        this.size = size;
        arr = new int[size];
    }

    void enqueue(int x) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear++;
        arr[rear] = x;
        System.out.println("Inserted: " + x);
    }

    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println("Deleted: " + arr[front]);
        front++;
    }
}

public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        QueueArray q = new QueueArray(5);

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