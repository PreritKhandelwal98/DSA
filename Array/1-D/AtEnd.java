
import java.util.Scanner;

public class AtEnd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];

        System.out.println("Enter Size of Array");
        int size = sc.nextInt();

        System.out.println("Enter Element for Array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array Before Insertion");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("");
        System.out.println("Enter new element");
        int ele = sc.nextInt();
        size = size + 1;
        arr[size - 1] = ele;

        System.out.println("Array After Insertion");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();

    }
}
