import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of elements");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("enter the elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length-1;i++) {
            int maxindex = 0;

            for (int j = 1; j < arr.length-i ; j++) {
                if (arr[j] > arr[maxindex]) {
                    maxindex = j;
                }

            }
            int temp=arr[arr.length-i-1];
            arr[arr.length-i-1]=arr[maxindex];
            arr[maxindex]=temp;

        }
        System.out.println("after swapping");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

    }
}
