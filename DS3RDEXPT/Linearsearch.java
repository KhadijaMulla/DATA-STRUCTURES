import java.util.Scanner;

public class Linearsearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target element: ");
        int target = sc.nextInt();
        boolean found = true ;
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                found = true;
                index = i;
                break;
            }
        }

        if (found) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found");
        }

        sc.close();
    }
}

