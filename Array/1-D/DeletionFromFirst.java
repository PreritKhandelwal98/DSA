import java.util.Scanner;

public class DeletionFromFirst {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];

        System.out.println("Enter Size of Array");
        int size = sc.nextInt();

        System.out.println("Enter Element for Array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array Before Deletion");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = size; i > 0; i--) {
            arr[i - 1] = arr[i];
        }

        System.out.println("");
        System.out.println("Array After Deletion");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
