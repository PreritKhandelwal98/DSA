
import java.util.Scanner;

public class AtAnyPos {
    public static void main(String args[]) {
        int[] arr = new int[20];
        Scanner sc = new Scanner(System.in);

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
        System.out.println("Enter position where you want to enter the element : ");
        int pos = sc.nextInt();
        size++;

        for (int i = arr.length - 1; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = ele;

        System.out.println("Array After Insertion");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
