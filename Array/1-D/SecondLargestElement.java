import java.util.Scanner;

public class SecondLargestElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int secondLargest = findSecondLargest(arr, n);

        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("Second largest element in the array: " + secondLargest);
        } else {
            System.out.println("Array does not have a second largest element.");
        }
    }

    public static int findSecondLargest(int[] arr, int n) {
        if (n < 2) {
            // Array should have at least two elements to have a second largest element.
            return Integer.MIN_VALUE;
        }

        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            } else if (arr[i] > secMax && arr[i] != max) {
                secMax = arr[i];
            }
        }

        return secMax;
    }
}
