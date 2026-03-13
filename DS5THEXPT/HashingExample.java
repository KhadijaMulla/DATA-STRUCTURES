import java.util.Scanner;

class HashingExample {
    int[] table;
    int m;
    int top = -1;

    HashingExample(int m) {
        this.m = m;
        table = new int[m];

        for (int i = 0; i < m; i++) {
            table[i] = -1;
        }
    }

    void insert(int key) {
    
        if (top == m - 1) {
            System.out.println("Hash Table is Overflow " + key);
            return;
        }

        int index = key % m;
        int originalIndex = index;

        while (table[index] != -1) {
            System.out.println(
                "Collision occurred at index " + index + " for key " + key
            );
            index = (index + 1) % m;

            if (index == originalIndex) {
                System.out.println("Hash Table is full!");
                return;
            }
        }

        table[index] = key;
        top++;
        System.out.println("Key " + key + " inserted at index " + index);
    }

    void display() {
        System.out.println("\nHash Table:");
        for (int i = 0; i < m; i++) {
            if (table[i] == -1)
                System.out.println(i + " empty");
            else
                System.out.println(i + " - " + table[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of  Table (m): ");
        int m = sc.nextInt();

        HashingExample hash = new HashingExample(m);

        int choice;
        do {
            System.out.println("\n Hashing Table ");
            System.out.println("1. Insert key");
            System.out.println("2. Display table");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value of key (k): ");
                    int key = sc.nextInt();
                    hash.insert(key);
                    break;

                case 2:
                    hash.display();
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 3);

        sc.close();
    }
}
