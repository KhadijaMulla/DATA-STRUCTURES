import java.util.Scanner;

class StackExample {
    int top;
    int size;
    int[] stack;

    StackExample(int size) {
        this.size = size;
        top = -1;
        stack = new int[size];
    }

    void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow " + value);
            return;
        }
        stack[++top] = value;
        System.out.println(value + " pushed into stack.");
    }

    void pop() {
        if (top == -1) {
            System.out.println(" Stack is empty.");
            return;
        }
        System.out.println(stack[top--] + " popped from stack.");
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of stack: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println(" Stack size must be greater than 0.");
            sc.close();
            return;
        }

        StackExample stack = new StackExample(size);
        int choice;

        do {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = sc.nextInt();
                    stack.push(value);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.display();
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}