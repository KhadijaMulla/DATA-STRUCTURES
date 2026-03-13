public class Arrayoperations{

    public static void main(String[] args) {

        
        int[] arr = new int[10];
        int size = 5;

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.println("Initial Array:");
        traverse(arr, size);

        
        System.out.println("\nAfter Insertion:");
        size = insert(arr, size , 2 ,3);
        traverse(arr, size);

        
        System.out.println("\nAfter Deletion:");
        size = delete(arr, size, 3);
        traverse(arr, size);

      
        System.out.println("\nAfter Update:");
        update(arr, size, 1, 99);
        traverse(arr, size);

        
        System.out.println("\nSearch Operation:");
        search(arr, size, 40);
    }

    
    static void traverse(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    
    static int insert(int[] arr, int size, int pos, int value) {
        for (int i = size; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = value;
        return size + 1;
    }

    static int delete(int[] arr, int size, int pos) {
        for (int i = pos; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        return size - 1;
    }

    
    static void update(int[] arr, int size, int pos, int value) {
        if (pos < size) {
            arr[pos] = value;
        }
    }

   
    static void search(int[] arr, int size, int key) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }
}
