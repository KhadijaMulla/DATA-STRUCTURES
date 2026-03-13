import java.util.Scanner;

public class Binarysearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target element: ");
        int target = sc.nextInt();

        int start = 0; 
        int end= arr.length-1;
        int mid;
        boolean found = true;
        while (start <= end) {
            mid = (start + end) / 2;

            if (arr[mid] == target) {
                found = true;
                System.out.println("Target found at index: " + mid);
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Target not found");
        }

        sc.close();
    }
}


