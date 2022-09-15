package InJava.Searching;
import java.util.Scanner;
public class LinearSearch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        // }

        System.out.println();
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i] == key){
                count =1;
                System.out.println("Element "+key+" found at a index of "+i);
            }
        }
        if(count==0){
            System.out.println("Element not found");
        }

        sc.close();
    }
}
